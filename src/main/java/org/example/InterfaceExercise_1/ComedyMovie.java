package org.example.InterfaceExercise_1;

class ComedyMovie extends Movie implements Playable, Reviewable {
    private double rating;
    private String review;

    public ComedyMovie(String title, int year) {
        super(title, year);
    }

    @Override
    public void play() {
        System.out.println("Playing " + title);
    }

    @Override
    public void leaveReview(String review) {
        this.review = review;
    }

    @Override
    public void rate(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }
}