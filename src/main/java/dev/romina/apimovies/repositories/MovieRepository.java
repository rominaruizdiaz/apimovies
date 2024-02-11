package dev.romina.apimovies.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.romina.apimovies.models.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    Optional<Movie> findByTitle(String title);
    List<Movie> findByGenre(String genre);
}
