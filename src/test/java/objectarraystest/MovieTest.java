package objectarrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

public class MovieTest {
    // Test methods here


    @Test
    public void testRatingAndProfitComparator() {
        Movie movie1 = new Movie(2005, 8.2, 50000000, 150000000);
        Movie movie2 = new Movie(2010, 7.5, 60000000, 200000000);
        Movie movie3 = new Movie(2005, 8.5, 70000000, 180000000);

        Movie[] movies = { movie1, movie2, movie3 };
        Arrays.sort(movies, Movie.ratingAndProfitComparator);

        assertEquals(movie3, movies[0]); // Highest rating and profit
        assertEquals(movie1, movies[1]);
        assertEquals(movie2, movies[2]);
    }

}
