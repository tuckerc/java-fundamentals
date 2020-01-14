package inheritance;

public class Review {

  private String body;
  private String author;
  private Integer numberOfStars;


  @Override
  public java.lang.String toString() {
    return "Review body: " + this.getBody() + "\n" +
        "Review author: " + this.getAuthor() + "\n" +
        "Number of stars: " + this.getNumberOfStars();
  }

  public Review(String body, String author, Integer numberOfStars) {
    this.body = body;
    this.author = author;
    this.numberOfStars = numberOfStars;
  }

  public String getBody() {
    return this.body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Integer getNumberOfStars() {
    return this.numberOfStars;
  }

  public void setNumberOfStars(Integer numberOfStars) {
    this.numberOfStars = numberOfStars;
  }


}
