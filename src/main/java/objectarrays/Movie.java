package objectarrays;


import java.util.Comparator;

public class Movie {
    private final int yearReleased;
    private final double rating;
    private final double budget;
    private final double collectionAmount;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    @Override
    public String toString() {
        return "Movie [yearReleased=" + yearReleased + ", rating=" + rating + ", budget=" + budget + ", collectionAmount=" + collectionAmount + "]";
    }
}

class RatingAndProfitComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        int ratingComparison = Double.compare(movie1.getRating(), movie2.getRating());
        if (ratingComparison != 0) {
            return ratingComparison;
        } else {
            double profit1 = movie1.getCollectionAmount() - movie1.getBudget();
            double profit2 = movie2.getCollectionAmount() - movie2.getBudget();
            return Double.compare(profit1, profit2);
        }
    }
}

class YearAndRatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        int yearComparison = Integer.compare(movie1.getYearReleased(), movie2.getYearReleased());
        if (yearComparison != 0) {
            return yearComparison;
        } else {
            return Double.compare(movie1.getRating(), movie2.getRating());
        }
    }
}

