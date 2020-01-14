package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class RestaurantTest {

  String name = "Canlis";
  Integer stars = 5;
  Integer price = 5;
  Restaurant<String, Integer, Review<String, Integer>> testRestaurant = new Restaurant<>(name, stars, price);

  @Before
  public void setUp() {

  }

  @Test
  public void restaurant_constructorTest() {
    assertEquals(testRestaurant.getName(), name);
    assertEquals(testRestaurant.getNumberOfStars(), stars);
    assertEquals(testRestaurant.getPriceCategory(), price);
  }

  @Test
  public void restaurant_toStringTest() {
    StringBuilder expected = new StringBuilder();
    expected.append(name).append(": ").append(stars).append(" stars, price category of ").append(price);
    assertEquals(expected.toString(), testRestaurant.toString());
  }

  @Test
  public void restaurant_addReviewTest() {
    String body = "This place is great!";
    String author = "Bob Smith";
    Integer stars = 5;
    Review<String, Integer> review = new Review<>(body, author, stars);
    testRestaurant.addReview(review);
    assertTrue(testRestaurant.getReviews().contains(review));
  }

}

