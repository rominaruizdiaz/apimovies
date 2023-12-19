package dev.romina.apimovies.repositories;

import dev.romina.apimovies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long>{
    
}
