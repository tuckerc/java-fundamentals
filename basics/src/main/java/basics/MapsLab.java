package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapsLab {
  /******************************************************************
   * Method Name: weatherData
   * Description: Method used to analyze temperatures in a given
   * month. The min and max temperatures are identified as well
   * as all the temperatures within the range of min - max that
   * did not occur during the month.
   * Input: array of integer arrays representing temperatures in
   * each week
   * Output: String with analysis results
   ******************************************************************/
  public static String weatherData(int[][] monthData) {

    int max = 0;
    int min = 1000;
    String analysisResults = "";
    HashSet<Integer> actualTemps = new HashSet<>();

    // iterate through monthData
    for(int[] week : monthData) {

      // check for empty arrays
      if(week.length == 0) return "Empty arrays not valid";

      for(int dailyTemp : week) {

        // store each temp in actualTemps
        actualTemps.add(dailyTemp);

        // update min and max when appropriate
        if(dailyTemp > max) max = dailyTemp;
        if(dailyTemp < min) min = dailyTemp;

      }
    }

    // Start building analysisResults with min and max
    analysisResults =
        "High: " + max + "\n" +
        "Low: " + min + "\n";

    // iterate through all possible temps within min - max
    for(int possibleTemp = min + 1; possibleTemp < max; possibleTemp++) {
      if(!actualTemps.contains(possibleTemp)) {
        analysisResults = analysisResults +
            "Never saw temperature: " + possibleTemp + "\n";
      }
    }
    analysisResults = analysisResults.substring(0, analysisResults.length() - 1);
    return analysisResults;
  }

  /******************************************************************
   * Method Name: tally
   * Description: Method used to tally the number of votes each
   * option receives and returns the winner.
   * Input: ArrayList containing individual votes
   * Output: String with the winner
   ******************************************************************/
  public static String tally(ArrayList<String> votes) {

    // check for an empty list
    if (votes.size() == 0) {
      return "There are no votes to tally";
    }

    // HashMap to store vote tallies
    HashMap<String, Integer> voteTallies = new HashMap<>();

    // loop through votes and store count of votes
    for (String vote : votes) {
      if (voteTallies.get(vote)  == null) {
        voteTallies.put(vote, 1);
      }
      else {
        voteTallies.put(vote, voteTallies.get(vote) + 1);
      }
    }

    String winner = "";
    int winnerCount = 0;
    // iterate through voteTallies and store winner
    for (Map.Entry<String, Integer> votePair : voteTallies.entrySet()) {
      String option = votePair.getKey();
      Integer value = votePair.getValue();
      if (value > winnerCount){
        winnerCount = value;
        winner = option;
      }
    }

    // return option with the most votes
    return winner;

  }

}
