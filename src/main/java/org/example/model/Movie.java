package org.example.model;

public class Movie {
    private long id ;
    private String direktor;
    private int rleaseYera;
    private Genre genre;
    private int runtime;

    public Movie(String direktor, int rleaseYera, int runtime) {
        this.direktor = direktor;
        this.rleaseYera = rleaseYera;
        this.runtime = runtime;
    }

    public Movie(long id, String direktor, int rleaseYera, Genre genre, int runtime) {
        this.id = id;
        this.direktor = direktor;
        this.rleaseYera = rleaseYera;
        this.genre = genre;
        this.runtime = runtime;
    }

    public Movie(String direktor, int rleaseYera, Genre genre, int runtime) {
        this.direktor = direktor;
        this.rleaseYera = rleaseYera;
        this.genre = genre;
        this.runtime = runtime;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDirektor() {
        return direktor;
    }

    public void setDirektor(String direktor) {
        this.direktor = direktor;
    }

    public int getRleaseYera() {
        return rleaseYera;
    }

    public void setRleaseYera(int rleaseYera) {
        this.rleaseYera = rleaseYera;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
