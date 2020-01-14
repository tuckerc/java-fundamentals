package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

  String body = "This place is great!";
  String author = "Bob Smith";
  Integer stars = 5;
  Review goodReview = new Review(body, author, stars);

  @Test
  public void review_constructorTest() {
    assertEquals(goodReview.getBody(), body);
    assertEquals(goodReview.getAuthor(), author);
    assertEquals(goodReview.getNumberOfStars(), stars);
  }

  @Test
  public void review_toStringTest() {
    String expected = "Review body: " + body + "\n" +
        "Review author: " + author + "\n" +
        "Number of stars: " + stars;
    assertEquals(expected, goodReview.toString());
  }
}
