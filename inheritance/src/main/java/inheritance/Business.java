package inheritance;

import java.util.LinkedList;

public class Business implements Reviewable {
  private String name;
  private String description;
  private Double numberOfStars;
  private Boolean starsIsCurrent;
  private Integer priceCategory;
  private LinkedList<Review> reviews;

  // Constructors
  public Business(String name, String description, Integer priceCategory) {
    this.name = name;
    this.description = description;
    this.priceCategory = priceCategory;
    this.numberOfStars = 0.0;
    this.starsIsCurrent = true;
    this.reviews = new LinkedList<>();
  }

  public Business(String name, String description) {
    this.name = name;
    this.description = description;
    this.priceCategory = 0;
    this.numberOfStars = 0.0;
    this.starsIsCurrent = true;
    this.reviews = new LinkedList<>();
  }

  public Business(String name, Integer priceCategory) {
    this.name = name;
    this.description = "";
    this.priceCategory = priceCategory;
    this.numberOfStars = 0.0;
    this.starsIsCurrent = true;
    this.reviews = new LinkedList<>();
  }

  public Business(String name) {
    this.name = name;
    this.description = "";
    this.priceCategory = 0;
    this.numberOfStars = 0.0;
    this.starsIsCurrent = true;
    this.reviews = new LinkedList<>();
  }

  public Business() {
    this.name = "";
    this.description = "";
    this.priceCategory = 0;
    this.numberOfStars = 0.0;
    this.starsIsCurrent = true;
    this.reviews = new LinkedList<>();
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getNumberOfStars() {
    if (!this.getStarsIsCurrent()) {
      this.updateStars();
    }
    return this.numberOfStars;
  }

  public void setNumberOfStars(Double numberOfStars) {
    if(numberOfStars > 0 && numberOfStars < 6) {
      this.numberOfStars = numberOfStars;
    } else {
      throw new IllegalArgumentException("stars can only be 1 - 5");
    }
  }

  public Boolean getStarsIsCurrent() {
    return starsIsCurrent;
  }

  public void setStarsIsCurrent(Boolean starsIsCurrent) {
    this.starsIsCurrent = starsIsCurrent;
  }

  public Integer getPriceCategory() {
    return priceCategory;
  }

  public void setPriceCategory(Integer priceCategory) {
    if(priceCategory > 0 && priceCategory < 6) {
      this.priceCategory = priceCategory;
    } else {
      throw new IllegalArgumentException("price category can only be 1 - 5");
    }
  }

  public LinkedList<Review> getReviews() {
    return reviews;
  }

  public void setReviews(LinkedList<Review> reviews) {
    this.reviews = reviews;
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
