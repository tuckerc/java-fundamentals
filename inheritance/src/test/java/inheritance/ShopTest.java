package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {

  Shop emptyShop;
  Shop shopWithNameOnly;
  Shop shopWithNameAndDescription;

  @Before
  public void setUp() {
    emptyShop = new Shop();

    String shopName = "Chase's Trinkets";
    shopWithNameOnly = new Shop(shopName);

    String shopDescription = "This is the place Chase sells all his weird stuff";
    shopWithNameAndDescription = new Shop(shopName, shopDescription);
  }

  @Test
  public void testShopConstructor() {
    assertEquals("", emptyShop.getName());
    assertEquals("", emptyShop.getDescription());
    assertEquals("Chase's Trinkets", shopWithNameOnly.getName());
    assertEquals("", shopWithNameOnly.getDescription());
    assertEquals("Chase's Trinkets", shopWithNameAndDescription.getName());
    assertEquals("This is the place Chase sells all his weird stuff", shopWithNameAndDescription.getDescription());
  }

  @Test
  public void testShopToString() {
    String expected = "Shop{" +
        "name='" + '\'' +
        ", description='" + '\'' +
        ", numberOfStars=" + (Double) 0.0 +
        '}';
    assertEquals(expected, emptyShop.toString());

    expected = "Shop{" +
        "name='" + "Chase's Trinkets" + '\'' +
        ", description='" + "" + '\'' +
        ", numberOfStars=" + (Double) 0.0 +
        '}';
    assertEquals(expected, shopWithNameOnly.toString());

    expected = "Shop{" +
        "name='" + "Chase's Trinkets" + '\'' +
        ", description='" + "This is the place Chase sells all his weird stuff" + '\'' +
        ", numberOfStars=" + (Double) 0.0 +
        '}';
    assertEquals(expected, shopWithNameAndDescription.toString());
  }

  @Test
  public void restaurant_addReviewTest() {
    String body = "This place is great!";
    String author = "Bob Smith";
    Double stars = 5.0;
    Review review = new Review(body, author, stars);
    shopWithNameAndDescription.addReview(review);
    body = "Perfect except they gave me the wrong coat.";
    author = "Tina C.";
    stars = 4.0;
    Review review2 = new Review(body, author, stars);
    shopWithNameAndDescription.addReview(review2);
    assertTrue(shopWithNameAndDescription.getReviews().contains(review));
    assertTrue(shopWithNameAndDescription.getReviews().contains(review2));
    assertEquals(shopWithNameAndDescription.getNumberOfStars(), (Double) 4.5);
  }

}
