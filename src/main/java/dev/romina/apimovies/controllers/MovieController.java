package dev.romina.apimovies.controllers;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.romina.apimovies.message.Message;
import dev.romina.apimovies.models.Movie;
import dev.romina.apimovies.services.IGenericService;
import dev.romina.apimovies.services.MovieService;

@RestController
@RequestMapping(path = "${api-endpoint}/movies")
public class MovieController {

    IGenericService<Movie> service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    // Obtener todas las películas
    @GetMapping(path = "")
    public List<Movie> index() {

        List<Movie> movies = service.getAll();
        return movies;

    }

    // Obtener una película mediante su Id
    @GetMapping(path = "/{id}")
    public ResponseEntity<Movie> show(@PathVariable("id") Long id) throws Exception {

        Movie movie = service.getById(id);

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(movie);
    }

    // Añadir una película
    @PostMapping(path = "")
    public ResponseEntity<Movie> create(@RequestBody Movie movie) {

        Movie newMovie = service.save(movie);

        return ResponseEntity.status(201).body(newMovie);
    }

    // Actualizar los datos de una película
    @PutMapping("/{id}")
    public ResponseEntity<Movie> update(@PathVariable("id") Long id, @RequestBody Movie movie) throws Exception {

        Movie updatedMovie = service.update(id, movie);

        return ResponseEntity.status(200).body(updatedMovie);
    }

    // Eliminar una película
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Message> remove(@PathVariable("id") Long id) throws Exception { 

        Message delete = service.delete(id);

        return ResponseEntity.status(200).body(delete);
    }

    // Buscar mediante su título
    @GetMapping(path = "/bytitle/{title}")
    public ResponseEntity<Movie> showByTitle(@PathVariable("title") String title) throws Exception {

        Movie movie = service.getByTitle(title);

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(movie);
    }

    // Buscar mediante su género
    @GetMapping(path = "/bygenre/{genre}")
    public ResponseEntity<List<Movie>> showByGenre(@PathVariable("genre") String genre) throws Exception {
    
        List<Movie> movies = service.getByGenre(genre);

    return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(movies);
    }
}
