package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private  final  static  String url ="jdbc:postgresql://localhost:5432/postgres";
    private  final  static  String username ="postgres";
    private  final  static  String possword ="postgres";

    public static Connection getConnection()  {
        Connection connection =null;

        try {
            connection= DriverManager.getConnection(url,username,possword);
            System.out.println("------ uspeshno -------");
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
        return connection;
    }
        }
