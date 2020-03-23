import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the coveringStains function below.
     */
    static int coveringStains(int k, int[][] coordinates) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] coordinates = new int[n][2];

        for (int coordinatesRowItr = 0; coordinatesRowItr < n; coordinatesRowItr  ) {
            String[] coordinatesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int coordinatesColumnItr = 0; coordinatesColumnItr < 2; coordinatesColumnItr  ) {
                int coordinatesItem = Integer.parseInt(coordinatesRowItems[coordinatesColumnItr]);
                coordinates[coordinatesRowItr][coordinatesColumnItr] = coordinatesItem;
            }
        }

        int result = coveringStains(k, coordinates);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
