package org.example.dao;

import org.example.model.Movie;

public interface MovieDao {
    void createTable();
    String insertMovie(Movie movie);

    void deleteMovieById(Long id);

   String getMovieByRyntimeRange(int min ,int maxRantime);

   String getMoviesSortByRleaseYear(String ascOrDesc);

}
