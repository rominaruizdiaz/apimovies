package dev.romina.apimovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.romina.apimovies.models.Movie;

public interface GenreRepository extends JpaRepository<Movie,Long> {
    
}
