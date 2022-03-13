package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    // AfishaRepository repository = new AfishaRepository();
    AfishaManager manager = new AfishaManager(5);

    private final FilmItem first = new FilmItem(
            1, 300, "first");
    private final FilmItem second = new FilmItem(
            2, 250, "second");
    private final FilmItem third = new FilmItem(
            3, 550, "third");
    private final FilmItem four = new FilmItem(
            4, 300, "four");
    private final FilmItem five = new FilmItem(
            5, 250, "five");
    private final FilmItem six = new FilmItem(
            6, 550, "six");
    private final FilmItem seven = new FilmItem(
            7, 300, "seven");
    private final FilmItem eight = new FilmItem(
            8, 250, "eight");
    private final FilmItem nine = new FilmItem(
            9, 550, "nine");
    private final FilmItem ten = new FilmItem(
            10, 300, "ten");
    private final FilmItem eleven = new FilmItem(
            11, 250, "eleven");
    private final FilmItem twelve = new FilmItem(
            12, 550, "twelve");

    @BeforeEach
    void prepareManager() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        manager.addFilm(eleven);
        manager.addFilm(twelve);
    }

    @Test
    public void shouldSave() {
        manager.addFilm(first);
        FilmItem[] expected = new FilmItem[]{
                first,
                twelve,
                eleven,
                ten,
                nine
        };
        FilmItem[] actual = manager.getItems();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {
        FilmItem[] actual = manager.getItems();
        FilmItem[] expected = {
                twelve,
                eleven,
                ten,
                nine,
                eight
        };
        assertArrayEquals(expected, actual);
    }

}