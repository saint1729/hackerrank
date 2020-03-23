import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the minimumAverage function below.
     */
    static int minimumAverage(int[][] customers) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int[][] customers = new int[n][2];

        for (int customersRowItr = 0; customersRowItr < n; customersRowItr  ) {
            String[] customersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int customersColumnItr = 0; customersColumnItr < 2; customersColumnItr  ) {
                int customersItem = Integer.parseInt(customersRowItems[customersColumnItr]);
                customers[customersRowItr][customersColumnItr] = customersItem;
            }
        }

        int result = minimumAverage(customers);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
