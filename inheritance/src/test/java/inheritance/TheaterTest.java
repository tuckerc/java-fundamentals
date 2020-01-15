package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TheaterTest {

  Theater emptyTheater;
  Theater theaterWithName;
  Theater theaterWithNameAndDescription;
  Theater theaterWithNameAndDescriptionAndPriceCategory;

  @Before
  public void setUp() throws Exception {
    emptyTheater = new Theater();
    String name = "Plaza Theater";
    theaterWithName = new Theater(name);
    String description = "A great place to watch a movie";
    theaterWithNameAndDescription = new Theater(name, description);
    Integer priceCategory = 5;
    theaterWithNameAndDescriptionAndPriceCategory = new Theater(name, description, priceCategory);
  }

  @Test
  public void testTheaterConstructor() {
    assertEquals("", emptyTheater.getName());
    assertEquals("Plaza Theater", theaterWithName.getName());
    assertEquals("A great place to watch a movie", theaterWithNameAndDescription.getDescription());
    assertEquals((Integer) 5, theaterWithNameAndDescriptionAndPriceCategory.getPriceCategory());
  }

  @Test
  public void testTheaterToString() {
    StringBuilder expected = new StringBuilder();
    expected.append("Plaza Theater").append(": ").append((Double) 0.0).append(" stars, price category of ").append((Integer) 5);
    assertEquals(expected.toString(), theaterWithNameAndDescriptionAndPriceCategory.toString());
  }

  @Test
  public void testTheaterAddReview() {
    String body = "This place is great!";
    String author = "Bob Smith";
    Double stars = 5.0;
    Review review = new Review(body, author, stars);
    theaterWithNameAndDescription.addReview(review);
    body = "Perfect except they gave me the wrong coat.";
    author = "Tina C.";
    stars = 4.0;
    Review review2 = new Review(body, author, stars);
    theaterWithNameAndDescription.addReview(review2);
    assertTrue(theaterWithNameAndDescription.getReviews().contains(review));
    assertTrue(theaterWithNameAndDescription.getReviews().contains(review2));
    assertEquals(theaterWithNameAndDescription.getNumberOfStars(), (Double) 4.5);
  }

  @Test
  public void testTheaterAddMovie() {
    theaterWithNameAndDescriptionAndPriceCategory.addMovie("Star Wars");
    assertTrue(theaterWithNameAndDescriptionAndPriceCategory.getMovies().contains("Star Wars"));
  }

  @Test
  public void testTheaterRemoveMovie() {
    theaterWithNameAndDescriptionAndPriceCategory.addMovie("Star Wars");
    theaterWithNameAndDescriptionAndPriceCategory.removeMovie("Star Wars");
    assertFalse(theaterWithNameAndDescriptionAndPriceCategory.getMovies().contains("Star Wars"));
  }

  @Test (expected = Exception.class)
  public void testTheaterMovieNotInCollection() {
    theaterWithNameAndDescriptionAndPriceCategory.addMovie("Star Wars");
    theaterWithNameAndDescriptionAndPriceCategory.removeMovie("Sandlot");
  }
}
