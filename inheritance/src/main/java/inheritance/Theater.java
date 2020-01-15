package inheritance;

import java.util.LinkedList;

public class Theater extends Business{

  private LinkedList<String> movies;

  // Constructors
  public Theater(String name, String description, Integer priceCategory) {
    super(name, description, priceCategory);
    movies = new LinkedList<>();
  }

  public Theater(String name, String description) {
    super(name, description);
    movies = new LinkedList<>();
  }

  public Theater(String name, Integer priceCategory) {
    super(name, priceCategory);
    movies = new LinkedList<>();
  }

  public Theater(String name) {
    super(name);
    movies = new LinkedList<>();
  }

  public Theater() {
    super();
    movies = new LinkedList<>();
  }

  // Getters and Setters
  public LinkedList<String> getMovies() {
    return movies;
  }

  public void addMovie(String newMovie) {
    this.getMovies().add(newMovie);
  }

  public void removeMovie(String movieToRemove) {
    if(!this.getMovies().contains(movieToRemove)) {
      throw new IllegalArgumentException("that movie is not found");
    }
    this.getMovies().remove(movieToRemove);
  }

}
