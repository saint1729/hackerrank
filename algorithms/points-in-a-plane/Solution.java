import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pointsInPlane function below.
     */
    static int[] pointsInPlane(int[][] coordinates) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int tItr = 0; tItr < t; tItr  ) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int[][] coordinates = new int[n][2];

            for (int coordinatesRowItr = 0; coordinatesRowItr < n; coordinatesRowItr  ) {
                String[] coordinatesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int coordinatesColumnItr = 0; coordinatesColumnItr < 2; coordinatesColumnItr  ) {
                    int coordinatesItem = Integer.parseInt(coordinatesRowItems[coordinatesColumnItr]);
                    coordinates[coordinatesRowItr][coordinatesColumnItr] = coordinatesItem;
                }
            }

            int[] result = pointsInPlane(coordinates);

            for (int resultItr = 0; resultItr < result.length; resultItr  ) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
