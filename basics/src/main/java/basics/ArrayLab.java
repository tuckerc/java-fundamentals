package basics;

import java.util.Arrays;

public class ArrayLab {

  /**************************************************************
   * Method Name: roll
   * Description: Method used to roll a six sided die a
   *   specified number of times and return the results.
   * Input: integer specifying number of rolls
   * Output: array of integers holding the results.
   **************************************************************/
  public static int[] roll(int rollCount) {

    // array used to store results
    int[] results = new int[rollCount];

    // roll die rollCount times and store each result
    for (int i = 0; i < rollCount; i++) {
      results[i] = (int) ((Math.random() * 6) + 1);
    }

    return results;
  }

  /**************************************************************
   * Method Name: containsDuplicates
   * Description: Method used to test if an array contains
   * duplicates
   * Input: array of integers
   * Output: boolean indicating if array contains duplicates
   **************************************************************/
  public static boolean containsDuplicates(int[] arr) {
    boolean hasDups = false;

    // sort the array
    Arrays.sort(arr);

    // compare each consecutive element to previous
    int lastVal = arr[0];
    for(int i = 1; i < arr.length; i++) {
      if(arr[i] == lastVal) {
        hasDups = true;
        return hasDups;
      }
      else {
        lastVal = arr[i];
      }
    }

    return hasDups;
  }

  /**************************************************************
   * Method Name: arrayAverage
   * Description: Method used to calculate the average of an
   * array
   * Input: array of integers
   * Output: integer representing the average
   **************************************************************/
  public static int arrayAverage(int[] arr) {

    // int to store total of all array integers
    int total = 0;
    // int to store average
    int average = 0;

    // loop through the array to calculate total
    for(int number : arr) {
      total += number;
    }

    // calculate average
    average = total / arr.length;

    // return average
    return average;

  }

  /**************************************************************
   * Method Name: lowestArrayAverage
   * Description: Method used to calculate the average of each
   * array within an array and return the lowest average
   * Input: array of arrays of integers
   * Output: integer with the lowest average
   **************************************************************/
  public static int lowestAverage(int[][] arr) {

    // int to store lowest average
    int lowest = arrayAverage(arr[0]);

    // calculate each average and update lowestAverage if less
    for(int i = 1; i < arr.length; i++) {
      int currentAverage = arrayAverage(arr[i]);
      if(currentAverage < lowest) {
        lowest = currentAverage;
      }
    }

    // return averages
    return lowest;

  }

}
