package ru.netology.manager;

import ru.netology.domain.FilmItem;

import static java.lang.System.arraycopy;

public class AfishaManager {
    private int countFilms = 10;
    private FilmItem[] items = new FilmItem[countFilms];     // создание пустого массива


    public AfishaManager(int countFilms) {
        this.countFilms = countFilms;
    }

    public AfishaManager() {
        this.countFilms = 10;

    }

    public void addFilm(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        // копируем поэлементно
        arraycopy(items, 0, tmp, 0, length - 1);

        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] getItems() {

        FilmItem[] draftResult = new FilmItem[countFilms];
        int counter = 0;
        // перебираем результаты
        for (int i = 0; i < countFilms; i++) {
            int index = items.length - i - 1;
            if (items[index] != null) {
                // выборка ненулевых значений
                draftResult[counter] = items[index];
                counter += 1;
            }
        }
        // создание массива с нужной длиной
        FilmItem[] result = new FilmItem[counter];
        arraycopy(draftResult, 0, result, 0, counter);

        return result;
    }
}
