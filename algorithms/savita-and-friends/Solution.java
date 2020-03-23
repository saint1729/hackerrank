import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the solve function below.
     */
    static double[] solve(int n, int k, int[][] roads) {
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
            String[] nmk = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int n = Integer.parseInt(nmk[0]);

            int m = Integer.parseInt(nmk[1]);

            int k = Integer.parseInt(nmk[2]);

            int[][] roads = new int[m][3];

            for (int roadsRowItr = 0; roadsRowItr < m; roadsRowItr  ) {
                String[] roadsRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int roadsColumnItr = 0; roadsColumnItr < 3; roadsColumnItr  ) {
                    int roadsItem = Integer.parseInt(roadsRowItems[roadsColumnItr]);
                    roads[roadsRowItr][roadsColumnItr] = roadsItem;
                }
            }

            double[] result = solve(n, k, roads);

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
