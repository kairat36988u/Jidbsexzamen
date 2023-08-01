package org.example;

import org.example.config.Config;
import org.example.service.GenreServiceImpl;
import org.example.service.MovieServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
       // Config.getConnection();
//        MovieServiceImpl movieService = new MovieServiceImpl();
//        movieService.createTable();
        GenreServiceImpl genreService= new GenreServiceImpl();
        genreService.createEnumGenre();







    }
}
