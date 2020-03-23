import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the bikeRacers function below.
     */
    static long bikeRacers(int[][] bikers, int[][] bikes) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nmk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nmk[0].trim());

        int m = Integer.parseInt(nmk[1].trim());

        int k = Integer.parseInt(nmk[2].trim());

        int[][] bikers = new int[n][2];

        for (int bikersRowItr = 0; bikersRowItr < n; bikersRowItr  ) {
            String[] bikersRowItems = scanner.nextLine().split(" ");

            for (int bikersColumnItr = 0; bikersColumnItr < 2; bikersColumnItr  ) {
                int bikersItem = Integer.parseInt(bikersRowItems[bikersColumnItr].trim());
                bikers[bikersRowItr][bikersColumnItr] = bikersItem;
            }
        }

        int[][] bikes = new int[n][2];

        for (int bikesRowItr = 0; bikesRowItr < n; bikesRowItr  ) {
            String[] bikesRowItems = scanner.nextLine().split(" ");

            for (int bikesColumnItr = 0; bikesColumnItr < 2; bikesColumnItr  ) {
                int bikesItem = Integer.parseInt(bikesRowItems[bikesColumnItr].trim());
                bikes[bikesRowItr][bikesColumnItr] = bikesItem;
            }
        }

        long result = bikeRacers(bikers, bikes);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
