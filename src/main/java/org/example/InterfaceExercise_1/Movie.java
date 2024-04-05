package org.example.InterfaceExercise_1;

abstract class Movie {
    protected String title;
    protected int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public abstract String getGenre();
}

