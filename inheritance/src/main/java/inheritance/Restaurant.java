package inheritance;

public class Restaurant extends Business {


  public Restaurant(String name, String description, Integer priceCategory) {
    super(name, description, priceCategory);
  }

  public Restaurant(String name, String description) {
    super(name, description);
  }

  public Restaurant(String name, Integer priceCategory) {
    super(name, priceCategory);
  }

  public Restaurant(String name) {
    super(name);
  }

  public Restaurant() {
    super();
  }

}
