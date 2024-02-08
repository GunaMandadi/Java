package objectarrays;


import java.util.Comparator;

class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

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

    // Comparator implementation to sort movies by rating and profit
    public static Comparator<Movie> ratingAndProfitComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            if (movie1.rating != movie2.rating) {
                return Double.compare(movie2.rating, movie1.rating); // Sort by rating descending
            } else {
                double profit1 = movie1.collectionAmount - movie1.budget;
                double profit2 = movie2.collectionAmount - movie2.budget;
                return Double.compare(profit2, profit1); // Sort by profit descending
            }
        }
    };

    // Comparator implementation to sort movies by year released and rating
    public static Comparator<Movie> yearAndRatingComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            if (movie1.yearReleased != movie2.yearReleased) {
                return Integer.compare(movie1.yearReleased, movie2.yearReleased); // Sort by year released ascending
            } else {
                return Double.compare(movie2.rating, movie1.rating); // If same year, sort by rating descending
            }
        }
    };
}
