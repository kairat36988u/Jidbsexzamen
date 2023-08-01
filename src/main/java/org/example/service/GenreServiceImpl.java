package org.example.service;

import org.example.dao.GenreDaoImpl;

public class GenreServiceImpl implements GenreService{
    GenreDaoImpl genreDao=new GenreDaoImpl();
    @Override
    public void createEnumGenre() {
        genreDao.createEnumGenre();
    }
}
