package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class RestaurantTest {

  String name = "Canlis";
  Integer price = 5;
  Restaurant testRestaurant = new Restaurant (name, price);

  @Before
  public void setUp() {

  }

  @Test
  public void restaurant_constructorTest() {
    assertEquals(testRestaurant.getName(), name);
    assertEquals(testRestaurant.getNumberOfStars(), (Double) 0.0);
    assertEquals(testRestaurant.getPriceCategory(), price);
  }

  @Test
  public void restaurant_toStringTest() {
    StringBuilder expected = new StringBuilder();
    expected.append(name).append(": ").append((Double) 0.0).append(" stars, price category of ").append(price);
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

