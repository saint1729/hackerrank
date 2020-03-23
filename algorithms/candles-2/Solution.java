import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the candlesCounting function below.
     */
    static int candlesCounting(int k, int[][] candles) {
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

        int[][] candles = new int[n][2];

        for (int candlesRowItr = 0; candlesRowItr < n; candlesRowItr  ) {
            String[] candlesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int candlesColumnItr = 0; candlesColumnItr < 2; candlesColumnItr  ) {
                int candlesItem = Integer.parseInt(candlesRowItems[candlesColumnItr]);
                candles[candlesRowItr][candlesColumnItr] = candlesItem;
            }
        }

        int result = candlesCounting(k, candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
