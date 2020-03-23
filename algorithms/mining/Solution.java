import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the mining function below.
     */
    static int mining(int k, int[][] mines) {
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

        int[][] mines = new int[n][2];

        for (int minesRowItr = 0; minesRowItr < n; minesRowItr  ) {
            String[] minesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int minesColumnItr = 0; minesColumnItr < 2; minesColumnItr  ) {
                int minesItem = Integer.parseInt(minesRowItems[minesColumnItr]);
                mines[minesRowItr][minesColumnItr] = minesItem;
            }
        }

        int result = mining(k, mines);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
