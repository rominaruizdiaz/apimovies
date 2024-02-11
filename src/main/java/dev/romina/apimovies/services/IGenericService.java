package dev.romina.apimovies.services;

import java.util.List;

import dev.romina.apimovies.message.Message;
import dev.romina.apimovies.models.Movie;

public interface IGenericService<T> {
    public List<T> getAll();
    public T getById(Long id) throws Exception;
    public T save(T obj);
    public T update(Long id, T obj) throws Exception;
    public Message delete (Long id) throws Exception;
    public T getByTitle(String title) throws Exception;
    public List<Movie> getByGenre(String genre);
}
