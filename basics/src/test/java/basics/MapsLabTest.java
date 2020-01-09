package basics;

import org.junit.Test;

import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MapsLabTest {

  /******************************************************************
   * Tests for the weatherData method
   *****************************************************************/
  @Test
  public void testWeatherDataHappy() {

    // Daily average temperatures for Seattle, October 1-28 2017
    int[][] weeklyMonthTemperatures = {
        {66, 64, 58, 65, 71, 57, 60},
        {57, 65, 65, 70, 72, 65, 51},
        {55, 54, 60, 53, 59, 57, 61},
        {65, 56, 55, 52, 55, 62, 57}
    };

    String expectedResults =
        "High: 72\n" +
        "Low: 51\n" +
        "Never saw temperature: 63\n" +
        "Never saw temperature: 67\n" +
        "Never saw temperature: 68\n" +
        "Never saw temperature: 69";

    String actualResults = MapsLab.weatherData(weeklyMonthTemperatures);

    assertEquals(expectedResults, actualResults);

  }

  @Test
  public void testWeatherDataFail() {

    // Daily average temperatures for Seattle, October 1-28 2017
    int[][] weeklyMonthTemperatures = {
        {66, 64, 58, 65, 71, 57, 60},
        {57, 65, 65, 70, 72, 65, 51},
        {55, 54, 60, 53, 59, 57, 61},
        {65, 56, 55, 52, 55, 62, 57}
    };

    String expectedResults = "This is not the correct result";

    String actualResults = MapsLab.weatherData(weeklyMonthTemperatures);

    assertNotEquals(expectedResults, actualResults);

  }

  @Test
  public void testWeatherDataEdge() {

    int[][] weeklyMonthTemperatures = {
        {},
        {},
        {},
        {}
    };

    String expectedResults = "Empty arrays not valid";

    String actualResults = MapsLab.weatherData(weeklyMonthTemperatures);

    assertEquals(expectedResults, actualResults);

  }

  /******************************************************************
   * Tests for the tally method
   *****************************************************************/
  @Test
  public void testTallyHappy() {

    ArrayList<String> votes = new ArrayList<>();
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Shrub");
    votes.add("Hedge");
    votes.add("Shrub");
    votes.add("Bush");
    votes.add("Hedge");
    votes.add("Bush");

    String expectedWinner = "Bush";
    String actualWinner = MapsLab.tally(votes);

    assertEquals(expectedWinner, actualWinner);

  }

  @Test
  public void testTallyFail() {

    ArrayList<String> votes = new ArrayList<>();
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Shrub");
    votes.add("Hedge");
    votes.add("Shrub");
    votes.add("Bush");
    votes.add("Hedge");
    votes.add("Bush");

    String expectedWinner = "Tree";
    String actualWinner = MapsLab.tally(votes);

    assertNotEquals(expectedWinner, actualWinner);

  }

  @Test
  public void testTallyEdge() {

    ArrayList<String> votes = new ArrayList<>();

    String expectedWinner = "There are no votes to tally";
    String actualWinner = MapsLab.tally(votes);

    assertEquals(expectedWinner, actualWinner);

  }

  @Test
  public void testLinterHappy() {

    Path filePath = new Path

  }

}
