import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int solve(int[][] restaurants) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] restaurants = new int[n][3];

        for (int restaurantsRowItr = 0; restaurantsRowItr < n; restaurantsRowItr  ) {
            String[] restaurantsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int restaurantsColumnItr = 0; restaurantsColumnItr < 3; restaurantsColumnItr  ) {
                int restaurantsItem = Integer.parseInt(restaurantsRowItems[restaurantsColumnItr]);
                restaurants[restaurantsRowItr][restaurantsColumnItr] = restaurantsItem;
            }
        }

        int result = solve(restaurants);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
