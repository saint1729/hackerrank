import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the tbsp function below.
     */
    static void tbsp(double c, double d, int[][] cities) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] ncd = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(ncd[0]);

        double c = Double.parseDouble(ncd[1]);

        double d = Double.parseDouble(ncd[2]);

        int[][] cities = new int[n][3];

        for (int citiesRowItr = 0; citiesRowItr < n; citiesRowItr  ) {
            String[] citiesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int citiesColumnItr = 0; citiesColumnItr < 3; citiesColumnItr  ) {
                int citiesItem = Integer.parseInt(citiesRowItems[citiesColumnItr]);
                cities[citiesRowItr][citiesColumnItr] = citiesItem;
            }
        }

        tbsp(c, d, cities);

        scanner.close();
    }
}
