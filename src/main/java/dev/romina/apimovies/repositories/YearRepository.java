package dev.romina.apimovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.romina.apimovies.models.Year;

public interface YearRepository extends JpaRepository<Year,Long> {

}
