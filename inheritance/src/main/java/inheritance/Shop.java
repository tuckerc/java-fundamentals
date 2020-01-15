package inheritance;

import java.util.LinkedList;

public class Shop extends Business {

  public Shop(String name, String description, Integer priceCategory) {
    super(name, description, priceCategory);
  }

  public Shop(String name, String description) {
    super(name, description);
  }

  public Shop(String name, Integer priceCategory) {
    super(name, priceCategory);
  }

  public Shop(String name) {
    super(name);
  }

  public Shop() {
  }

  @Override
  public String toString() {
    return "Shop{" +
        "name='" + this.getName() + '\'' +
        ", description='" + this.getDescription() + '\'' +
        ", numberOfStars=" + this.getNumberOfStars() +
        '}';
  }

}
