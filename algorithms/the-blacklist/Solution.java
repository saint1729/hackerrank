import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the blacklist function below.
     */
    static int blacklist(int[][] amounts) {
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

        int[][] amounts = new int[k][n];

        for (int amountsRowItr = 0; amountsRowItr < k; amountsRowItr  ) {
            String[] amountsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int amountsColumnItr = 0; amountsColumnItr < n; amountsColumnItr  ) {
                int amountsItem = Integer.parseInt(amountsRowItems[amountsColumnItr]);
                amounts[amountsRowItr][amountsColumnItr] = amountsItem;
            }
        }

        int result = blacklist(amounts);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
