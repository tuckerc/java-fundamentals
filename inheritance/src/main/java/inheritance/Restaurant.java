package inheritance;

import java.util.LinkedList;

public class Restaurant {

  private String name;
  private Double numberOfStars;
  private Integer priceCategory;
  private LinkedList<Review> reviews;


  // Constructors
  public Restaurant(String name, Double numberOfStars, Integer priceCategory) {
    this.name = name;
    this.numberOfStars = numberOfStars;
    this.priceCategory = priceCategory;
    this.reviews = new LinkedList<>();
  }

  // Access Modifiers
  public void setName(String newName) {
    this.name = newName;
  }

  public String getName() {
    return this.name;
  }

  public void setNumberOfStars(Double stars) {
    this.numberOfStars = stars;
  }

  public Double getNumberOfStars() {
    return this.numberOfStars;
  }

  public void setPriceCategory(Integer newPriceCategory) {
    this.priceCategory = newPriceCategory;
  }

  public Integer getPriceCategory() {
    return this.priceCategory;
  }

  public LinkedList<Review> getReviews() {
    return reviews;
  }

  /******************************************************************
   * Name: addReview
   * Description: method used to add a review for a Restaurant
   * Input: Review
   * Output: void
   *****************************************************************/
  public void addReview(Review review) {
    this.getReviews().add(review);
    Double currentStars = this.getNumberOfStars();
    Integer reviewStars
    Double newStars = (this.getNumberOfStars() + review.getNumberOfStars()) / (this.getReviews().size() + 1);
    this.setNumberOfStars(newStars);
  }

  @Override
  public java.lang.String toString() {
    return this.getName() + ": " + this.getNumberOfStars() +
        " stars, price category of " + this.getPriceCategory();
  }

}
