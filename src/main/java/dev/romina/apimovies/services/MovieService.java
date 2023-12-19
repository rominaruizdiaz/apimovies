package dev.romina.apimovies.services;

import java.util.List;
import dev.romina.apimovies.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import dev.romina.apimovies.exceptions.MovieNotFoundException;
import dev.romina.apimovies.models.Movie;

@Service
public class MovieService {
    
    MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> getAll() {
        List<Movie> movies = repository.findAll();
        return movies;
    }

    public Movie getById(Long id) throws Exception {
        Movie movie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

        return movie;
    }

    public Movie save(Movie movie) {
        
        Movie newMovie = repository.save(movie);
        return newMovie;
    }

}
