package org.example.dao;

import org.example.config.Config;
import org.example.model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieDaoImpl implements MovieDao {
    @Override
    public void createTable() {
        String sql = "create table if not exists  movies(" +
                "id serial primary key," +
                "direktor varchar ," +
                "rlease_Yera int ," +
                "runtime int )";
        try {
            Connection connection = Config.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("----- Achyldy ---");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String insertMovie(Movie movie) {
        return null;
    }

    @Override
    public void deleteMovieById(Long id) {

    }


    @Override
    public String getMovieByRyntimeRange(int min, int maxRantime) {
        return null;
    }

    @Override
    public String getMoviesSortByRleaseYear(String ascOrDesc) {
        return null;
    }
}
