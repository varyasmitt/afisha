package ru.netology.domain;


public class FilmItem {
    private int id;
    private String name;
    private String genre;

    public FilmItem(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }
}