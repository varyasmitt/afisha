package ru.netology.manager;

import ru.netology.domain.FilmItem;

import static java.lang.System.arraycopy;

public class AfishaManager {
    private int defaultLength;
    private FilmItem[] items = new FilmItem[0];

    public AfishaManager(int defaultLength) {
        this.defaultLength = defaultLength;
    }

    public AfishaManager() {
        this.defaultLength = 10;
    }

    public void add(FilmItem newItem) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = newItem;
        this.items = tmp;
    }

    public FilmItem[] findAll() {
        return items;
    }

    public FilmItem[] findLast() {
        int resultLength;
        if (defaultLength < items.length) {
            resultLength = defaultLength;
        } else {
            resultLength = items.length;
        }
        FilmItem[] tmp = new FilmItem[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }
}