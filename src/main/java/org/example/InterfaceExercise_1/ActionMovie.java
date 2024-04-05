package org.example.InterfaceExercise_1;

class ActionMovie extends Movie implements Playable {
    public ActionMovie(String title, int year) {
        super(title, year);
    }

    @Override
    public void play() {
        System.out.println("Playing " + title);
    }

    @Override
    public String getGenre() {
        return "Action";
    }
}