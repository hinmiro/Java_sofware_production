package module02;

import java.util.ArrayList;

public class Book {
    private final String title, author;
    private final int year;
    private double rating = 0;
    private final ArrayList<String> reviews = new ArrayList<>();

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return this.rating;
    }


    public void addReview(String review) {
        reviews.add(review);
    }

    public ArrayList<String> getReview() {
        return reviews;
    }
}
