import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the drive function below.
     */
    static int drive(int n, int k, int[] d, int[][] commuters) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nmk = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(nmk[0]);

        int m = Integer.parseInt(nmk[1]);

        int k = Integer.parseInt(nmk[2]);

        int[] d = new int[n-1];

        String[] dItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int dItr = 0; dItr < n-1; dItr  ) {
            int dItem = Integer.parseInt(dItems[dItr]);
            d[dItr] = dItem;
        }

        int[][] commuters = new int[m][3];

        for (int commutersRowItr = 0; commutersRowItr < m; commutersRowItr  ) {
            String[] commutersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int commutersColumnItr = 0; commutersColumnItr < 3; commutersColumnItr  ) {
                int commutersItem = Integer.parseInt(commutersRowItems[commutersColumnItr]);
                commuters[commutersRowItr][commutersColumnItr] = commutersItem;
            }
        }

        int result = drive(n, k, d, commuters);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
