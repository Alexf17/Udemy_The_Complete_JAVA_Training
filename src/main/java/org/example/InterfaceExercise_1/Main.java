package org.example.InterfaceExercise_1;

public class Main {
    public static void main(String[] args) {
        ActionMovie actionMovie = new ActionMovie("Die Hard", 1988);
        actionMovie.play();
        System.out.println("Genre: " + actionMovie.getGenre());

        ComedyMovie comedyMovie = new ComedyMovie("Bridesmaids", 2011);
        comedyMovie.play();
        comedyMovie.leaveReview("Hilarious movie!");
        comedyMovie.rate(4.5);
        System.out.println("Genre: " + comedyMovie.getGenre());
        System.out.println("Rating: " + comedyMovie.getRating());
        System.out.println("Review: " + comedyMovie.getReview());
    }
}
