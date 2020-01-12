/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(linter(new File("src/main/resources/gates.js")));
    }

    /******************************************************************
     * Method Name: linter
     * Description: Method used to examine a JavaScript file and
     * identify missing semicolons.
     * Input: Path to JavaScript file
     * Output: String with linter results
     ******************************************************************/
    public static String linter(File filePath) {

        // String to store linter results
        String results = "";

        Scanner fileScanner;

        try {

            fileScanner = new Scanner(filePath);
            int lineNumber = 1;

            while(fileScanner.hasNextLine()) {

                String testLine = fileScanner.nextLine();

                if ((testLine.contains("{") && testLine.contains("}") &&
                    !testLine.contains(";") && !testLine.contains("if") &&
                    !testLine.contains("else")) ||
                    !testLine.contains(";") &&
                    !testLine.contains("if") &&
                    !testLine.contains("else") &&
                    !testLine.endsWith("{") &&
                    !testLine.endsWith("}") &&
                    !testLine.isEmpty() &&
                    !testLine.startsWith("//") &&
                    !testLine.startsWith("/*")) {

                    results = results + "Line " + lineNumber + ": Missing semicolon\n";

                }

                lineNumber++;

            }

        }

        catch (FileNotFoundException e) {

            System.out.println(e.getLocalizedMessage());
            System.out.println("couldn't find the file");

        }

        String trimmedResults = results.trim();

        // return results
        return trimmedResults;

    }
}
