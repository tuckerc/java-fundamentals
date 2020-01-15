package inheritance;

import java.util.LinkedList;

public class Restaurant {

  private String name;
  private Double numberOfStars;
  private Boolean starsIsCurrent;
  private Integer priceCategory;
  private LinkedList<Review> reviews;


  // Constructors
  public Restaurant(String name, Integer priceCategory) {
    this.name = name;
    this.numberOfStars = 0.0;
    this.starsIsCurrent = true;
    this.priceCategory = priceCategory;
    this.reviews = new LinkedList<>();
  }

  // Getters and Setters
  public void setName(String newName) {
    this.name = newName;
  }

  public String getName() {
    return this.name;
  }

  public void setNumberOfStars(Double stars) {
    if(stars > 0 && stars < 6) {
      this.numberOfStars = stars;
    } else {
      throw new IllegalArgumentException("stars can only be 1 - 5");
    }
  }

  public Double getNumberOfStars() {
    if (!this.getStarsIsCurrent()) {
      this.updateStars();
    }
    return this.numberOfStars;
  }

  public void setPriceCategory(Integer newPriceCategory) {
    if(newPriceCategory > 0 && newPriceCategory < 6) {
      this.priceCategory = newPriceCategory;
    } else {
      throw new IllegalArgumentException("price category can only be 1 - 5");
    }
  }

  public Integer getPriceCategory() {
    return this.priceCategory;
  }

  public LinkedList<Review> getReviews() {
    return reviews;
  }

  public Boolean getStarsIsCurrent() {
    return starsIsCurrent;
  }

  public void setStarsIsCurrent(Boolean starsIsCurrent) {
    this.starsIsCurrent = starsIsCurrent;
  }

  /******************************************************************
   * Name: updateStars
   * Description: method used to update the number of stars
   * Input: none
   * Output: void
   *****************************************************************/
  public void updateStars() {
    Double starsSum = 0.0;
    for (Review review : reviews) {
      starsSum += review.getNumberOfStars();
    }
    this.setNumberOfStars(starsSum / this.getReviews().size());
    this.setStarsIsCurrent(true);
  }

  /******************************************************************
   * Name: addReview
   * Description: method used to add a review for a Restaurant
   * Input: Review
   * Output: void
   *****************************************************************/
  public void addReview(Review review) {
    this.getReviews().add(review);
    this.setStarsIsCurrent(false);
  }

  @Override
  public java.lang.String toString() {
    return this.getName() + ": " + this.getNumberOfStars() +
        " stars, price category of " + this.getPriceCategory();
  }
}
