package basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayLabTest {

  /******************************************************
   ** Tests for the roll method
   *****************************************************/
  @Test
  public void rollTestHappy1() {

    int rollCount = 10;
    int[] returnArr = ArrayLab.roll(rollCount);

    //test for proper length
    int expectedLength = 10;
    int actualLength = returnArr.length;
    assertEquals("The returned array should have a length of " + expectedLength, expectedLength, actualLength);

    // test for proper range in each element
    for(int num : returnArr) {
      System.out.println(num);
      boolean actual = num > 0 && num < 7;
      assertTrue(actual);
    }

  }

  @Test
  public void rollTestHappy2() {

    int rollCount = 0;
    int[] returnArr = ArrayLab.roll(rollCount);

    //test for proper length
    int expectedLength = 0;
    int actualLength = returnArr.length;
    assertEquals("The returned array should have a length of " + expectedLength, expectedLength, actualLength);

  }

  @Test
  public void rollTestFail1() {

    // test for expected different lengths
    int rollCount = 25;
    int expectedLength = 11;
    int actualLength = ArrayLab.roll(rollCount).length;
    assertNotEquals("The returned array should not have a length of " + expectedLength, expectedLength, actualLength);

  }

  @Test
  public void rollTestEdge1() {

    int rollCount = 1000000;
    int[] returnArr = ArrayLab.roll(rollCount);

    //test for proper length
    int expectedLength = 1000000;
    int actualLength = returnArr.length;
    assertEquals("The returned array should have a length of " + expectedLength, expectedLength, actualLength);

  }

  /******************************************************
   ** Tests for the containsDuplicates method
   *****************************************************/
  @Test
  public void containsDuplicateTestHappy1() {

    int[] testArr = {1, 2, 3, 3, 2, 1};
    boolean actual = ArrayLab.containsDuplicates(testArr);
    assertTrue("The result should be true", actual);

  }

  @Test
  public void containsDuplicateTestHappy2() {

    int[] testArr = {0,0};
    boolean actual = ArrayLab.containsDuplicates(testArr);
    assertTrue("The result should be true", actual);

  }

//  @Test
//  public void containsDuplicateTestFail1() {
//
//    boolean expected = true;
//    int[] testArr = {1, 2, 3, 4, 5};
//    boolean actual = ArrayLab.containsDuplicates(testArr);
//    assertTrue("The result should be false", actual == expected);
//
//  }

  @Test
  public void containsDuplicateTestEdge1() {

    boolean expected = false;
    int[] testArr = {1};
    boolean actual = ArrayLab.containsDuplicates(testArr);
    assertTrue("The result should be true", actual == expected);

  }

  /******************************************************
   ** Tests for the arrayAverage method
   *****************************************************/
  @Test
  public void arrayAverageTestHappy1() {

    int expected = 5;
    int[] testArr = {0, 5, 10};
    int actual = ArrayLab.arrayAverage(testArr);
    assertEquals("The average should be " + expected, expected, actual);

  }

  @Test
  public void arrayAverageTestHappy2() {

    int expected = 252;
    int[] testArr = {2, 8, 9, 7, 45, 68, 1200, 678};
    int actual = ArrayLab.arrayAverage(testArr);
    assertEquals("The average should be " + expected, expected, actual);

  }

  @Test
  public void arrayAverageTestFail1() {

    int expected = 5;
    int[] testArr = {2, 8, 9, 7, 45, 68, 1200, 678};
    int actual = ArrayLab.arrayAverage(testArr);
    assertNotEquals("The average should not be " + expected, expected, actual);

  }

  @Test
  public void arrayAverageTestEdge1() {

    int expected = 2;
    int[] testArr = {2};
    int actual = ArrayLab.arrayAverage(testArr);
    assertEquals("The average should be " + expected, expected, actual);

  }

  /******************************************************
   ** Tests for the twoDimArrayAverage method
   *****************************************************/
  @Test
  public void lowestAverageTestHappy1() {

    int[][] testArr = {{2, 4, 6, 8, 10}, {1, 3, 5}, {3, 4}, {4, 6}};
    int expected = 3;
    int actual = ArrayLab.lowestAverage(testArr);
    assertEquals("The lowest average should be " + expected,expected, actual);

  }

  @Test
  public void lowestAverageTestHappy2() {

    int[][] testArr = {{2, 2, 2, 2}, {5, 5, 5, 5}, {47, 47, 47}, {890, 890, 890, 890}};
    int expected = 2;
    int actual = ArrayLab.lowestAverage(testArr);
    assertEquals("The lowest average should be " + expected,expected, actual);

  }

  @Test
  public void lowestAverageTestFail1() {

    int[][] testArr = {{2, 4, 6, 8, 10}, {1, 3, 5}, {3, 4}, {4, 6}};
    int expected = 523;
    int actual = ArrayLab.lowestAverage(testArr);
    assertNotEquals("The lowest average should not be " + expected,expected, actual);

  }

  @Test
  public void lowestAverageTestEdge1() {

    int[][] testArr = {{223}, {578}, {47}, {46}};
    int expected = 46;
    int actual = ArrayLab.lowestAverage(testArr);
    assertEquals("The lowest average should be " + expected,expected, actual);

  }
}