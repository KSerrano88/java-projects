
//import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;


/**
 * ReadFile
 */
public class Employee {
    public static void main(String[] args) throws FileNotFoundException {
        String f = "file.txt";

        // Create a Scanner object to read the file
        Scanner scanner = new Scanner(new File(f));

        System.out.println(scanner.);

        // Create a 2D array to store the data
        String[][] data = new String[10][4];

        // Read the file line by line
        while (scanner.hasNextLine()) {
            // Split the line into tokens using the delimiter
            String[] tokens = scanner.nextLine().split(",\\t|\\t");

            //System.out.println(tokens[3]);

            //Store the tokens in the 2D array
            for (int i = 0; i < tokens.length; i++) {
                data[i][0] = tokens[i];
            }
        }
        scanner.close();

        System.out.println(data.length);
        //Print the 2D array
        for (int i = 0; i < data.length; i++) {
            //for (int j = 0; j < data[i].length; j++) {
            //    System.out.print(data[i][j] + " ");
            //}
           // System.out.print(data[0]);
        }
    }
}