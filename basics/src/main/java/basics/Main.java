import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    /************************************************************
    ** pluralize tests
    ************************************************************/
    // int dogCount = 1;
    // System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    // int catCount = 2;
    // System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    // int turtleCount = 0;
    // System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    /***********************************************************
    ** flipNHeads tests
    ***********************************************************/
    // int heads = 3;
    // int headsCount = flipNHeads(heads);
    // System.out.println("It took " + headsCount + " flips to flip " + heads + pluralize(" head", heads) + " in a row.");

    // heads = 0;
    // headsCount = flipNHeads(heads);
    // System.out.println("It took " + headsCount + " flips to flip " + heads + pluralize(" head", heads) + " in a row.");

    // heads = 10;
    // headsCount = flipNHeads(heads);
    // System.out.println("It took " + headsCount + " flips to flip " + heads + pluralize(" head", heads) + " in a row.");

    // heads = -1;
    // headsCount = flipNHeads(heads);
    // System.out.println("It took " + headsCount + " flips to flip " + heads + pluralize(" head", heads) + " in a row.");

    /***********************************************************
    ** clock test
    ***********************************************************/
    clock();
  }

  /********************************************************** 
  ** Method Name: pluralize
  ** Description: method used to pluralize a string if the 
  ** quantity is greater than 1.
  ** Input: String to be pluralized, int to determine if the
  ** string should be pluralized.
  ** Output: String
  **********************************************************/
  public static String pluralize(String str, int count) {
    if(count != 1) str = str + "s";
    return str;
  }

  /********************************************************** 
  ** Method Name: flipNHeads
  ** Description: method used to randomly determine the 
  ** number of times it takes to flip a coin and get a 
  ** certain number of heads in a row.
  ** Input: int indicating the number of desired consecutive
  ** heads
  ** Output: String with the result of each flip. Returns int 
  ** indicating the number of flips to get desired number of 
  ** consecutive flips.
  **********************************************************/
  public static int flipNHeads(int n) {
    int flipCount = 0;
    int headsCount = 0;
    while (headsCount < n) {
      if (Math.random() > 0.5) {
        System.out.println("heads");
        headsCount++;
      }
      else {
        System.out.println("tails");
        headsCount = 0;
      }
      flipCount++;
    }
    return flipCount;
  }

  /********************************************************** 
  ** Method Name: clock
  ** Description: method used to display the time second by 
  ** second
  ** Input: none
  ** Output: String with the current time in HH:mm:ss format
  ** and cycles per second in MHz
  **********************************************************/
  public static void clock() {
    int cycleCount = 0;
    while(true) {
      cycleCount++;
      LocalDateTime now = LocalDateTime.now();
      if(now.getNano() == 0) {
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        double megahertz = cycleCount / 1000000.0;
        System.out.println(time + " " + megahertz + " MHz");
        cycleCount = 0;
      }
    }
  }
}