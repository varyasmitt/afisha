package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    private AfishaManager service = new AfishaManager();
    private FilmItem film1 = new FilmItem(1, "Бладшот", "боевик");
    private FilmItem film2 = new FilmItem(2, "Вперёд", "мультфильм");
    private FilmItem film3 = new FilmItem(3, "Белград", "комедия");
    private FilmItem film4 = new FilmItem(4, "Джентельмены", "боевик");
    private FilmItem film5 = new FilmItem(5, "Человек-невидимка", "ужасы");
    private FilmItem film6 = new FilmItem(6, "Тролли. Мировой тур", "мультфильм");
    private FilmItem film7 = new FilmItem(7, "Номер один", "комедия");
    private FilmItem film8 = new FilmItem(8, "Ледниковый период", "мультфильм");
    private FilmItem film9 = new FilmItem(9, "Форсаж", "Боевик");
    private FilmItem film10 = new FilmItem(10, "Маски-шоу", "комедия");
    private FilmItem film11 = new FilmItem(11, "Java", "ужасы");
    private FilmItem film12 = new FilmItem(12, "JavaScript", "Хоррор");

    @Test
    void add() {
        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        service.add(film1);
        service.add(film2);
        service.add(film3);
        service.add(film4);
        service.add(film5);
        service.add(film6);
        service.add(film7);
        service.add(film8);
        service.add(film9);
        service.add(film10);
        assertArrayEquals(expected, service.findAll());
    }

    @Test
    void shouldFindLast() {
        AfishaManager afishaManager = new AfishaManager();
        FilmItem[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        afishaManager.add(film1);
        afishaManager.add(film2);
        afishaManager.add(film3);
        afishaManager.add(film4);
        afishaManager.add(film5);
        afishaManager.add(film6);
        afishaManager.add(film7);
        afishaManager.add(film8);
        afishaManager.add(film9);
        afishaManager.add(film10);
        assertArrayEquals(expected, afishaManager.findLast());
    }

    @Test
    void shouldLastIfLimitDefault() {
        AfishaManager afishaManager = new AfishaManager();
        FilmItem[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};
        afishaManager.add(film1);
        afishaManager.add(film2);
        afishaManager.add(film3);
        afishaManager.add(film4);
        afishaManager.add(film5);
        afishaManager.add(film6);
        afishaManager.add(film7);
        afishaManager.add(film8);
        afishaManager.add(film9);
        afishaManager.add(film10);
        afishaManager.add(film11);
        afishaManager.add(film12);
        assertArrayEquals(expected, afishaManager.findLast());
    }

    @Test
    void shouldLastIfEnterLimit() {
        AfishaManager afishaManager = new AfishaManager(5);
        FilmItem[] expected = {film12, film11, film10, film9, film8};
        afishaManager.add(film1);
        afishaManager.add(film2);
        afishaManager.add(film3);
        afishaManager.add(film4);
        afishaManager.add(film5);
        afishaManager.add(film6);
        afishaManager.add(film7);
        afishaManager.add(film8);
        afishaManager.add(film9);
        afishaManager.add(film10);
        afishaManager.add(film11);
        afishaManager.add(film12);
        assertArrayEquals(expected, afishaManager.findLast());
    }
}
