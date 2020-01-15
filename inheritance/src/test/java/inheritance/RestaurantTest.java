package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class RestaurantTest {


  Restaurant testRestaurant;

  @Before
  public void setUp() {
    String name = "Canlis";
    Integer price = 5;
    testRestaurant = new Restaurant (name, price);
  }

  @Test
  public void restaurant_constructorTest() {
    assertEquals("Canlis", testRestaurant.getName());
    assertEquals((Double) 0.0, testRestaurant.getNumberOfStars());
    assertEquals((Integer) 5, testRestaurant.getPriceCategory());
  }

  @Test
  public void restaurant_toStringTest() {
    StringBuilder expected = new StringBuilder();
    expected.append("Canlis").append(": ").append((Double) 0.0).append(" stars, price category of ").append((Integer) 5);
    assertEquals(expected.toString(), testRestaurant.toString());
  }

  @Test
  public void restaurant_addReviewTest() {
    String body = "This place is great!";
    String author = "Bob Smith";
    Double stars = 5.0;
    Review review = new Review(body, author, stars);
    testRestaurant.addReview(review);
    body = "Perfect except they gave me the wrong coat.";
    author = "Tina C.";
    stars = 4.0;
    Review review2 = new Review(body, author, stars);
    testRestaurant.addReview(review2);
    assertTrue(testRestaurant.getReviews().contains(review));
    assertTrue(testRestaurant.getReviews().contains(review2));
    assertEquals(testRestaurant.getNumberOfStars(), (Double) 4.5);
  }

}

