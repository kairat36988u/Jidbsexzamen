package org.example.dao;

import org.example.config.Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GenreDaoImpl implements GenreDao {

    @Override
    public void createEnumGenre() {

        String sql = "create  type Genre as enum('ACTION','COMEDY','DRAMA','ROMANCE','FANTASY','ANIMATION')";
        try (
                Connection connection = Config.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.executeUpdate();
            System.out.println("saktaldy");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    }

