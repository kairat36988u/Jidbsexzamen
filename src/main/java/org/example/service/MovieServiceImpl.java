package org.example.service;

import org.example.dao.MovieDaoImpl;

public class MovieServiceImpl implements MovieService{
    MovieDaoImpl movieDao =new MovieDaoImpl();
    @Override
    public void createTable() {
       movieDao.createTable();
    }
}
