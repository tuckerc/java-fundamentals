# Java Basics
**pluralize**
- Description: method used to pluralize a string if the quantity is greater than 1.
- Input: String to be pluralized, int to determine if the string should be pluralized.
- Output: String

**flipNHeads**
- Description: method used to randomly determine the number of times it takes to flip a coin and get a certain number of heads in a row.
- Input: int indicating the number of desired consecutive heads
- Output: String with the result of each flip. Returns int indicating the number of flips to get desired number of consecutive flips.
- Psuedocode Version 1
![Psuedocode Version 1](./assets/flipNHeadsPsuedoV1.jpg)
- Psuedocode Version 2
![Psuedocode Version 2](./assets/flipNHeadsPsuedoV2.jpg)

**clock**
- Description: method used to display the time second by second
- Input: none
- Output: String with the current time in HH:mm:ss format and cycles per second in MHz

**roll**
- Description: Method used to roll a six sided die a specified number of times and return the results.
- Input: integer specifying number of rolls
- Output: array of integers holding the results.

**containsDuplicates**
- Description: Method used to test if an array contains duplicates
- Input: array of integers
- Output: boolean indicating if array contains duplicates

**arrayAverage**
- Description: Method used to calculate the average of an array
- Input: array of integers
- Output: integer representing the average

**lowestAverage**
- Description: Method used to calculate the average of each array within an array and return the lowest average
- Input: array of arrays of integers
- Output: integer with the lowest average

**weatherData**
- Description: Method used to analyze temperatures in a given month. The min and max temperatures are identified as well as all the temperatures within the range of min - max that did not occur during the month.
- Input: array of integer arrays representing temperatures in each week
- Output: String with analysis results

**tally**
- Description: Method used to tally the number of votes each option receives and returns the winner.
- Input: ArrayList containing individual votes
- Output: String with the winner