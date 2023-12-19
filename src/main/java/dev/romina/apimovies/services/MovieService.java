package dev.romina.apimovies.services;

import java.util.List;
import dev.romina.apimovies.repositories.MovieRepository;
import org.springframework.stereotype.Service;
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
}
