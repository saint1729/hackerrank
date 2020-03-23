import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the cluesOnBinaryPath function below.
     */
    static int cluesOnBinaryPath(int n, int d, int[][] roads) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nmd = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(nmd[0]);

        int m = Integer.parseInt(nmd[1]);

        int d = Integer.parseInt(nmd[2]);

        int[][] roads = new int[m][3];

        for (int roadsRowItr = 0; roadsRowItr < m; roadsRowItr  ) {
            String[] roadsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int roadsColumnItr = 0; roadsColumnItr < 3; roadsColumnItr  ) {
                int roadsItem = Integer.parseInt(roadsRowItems[roadsColumnItr]);
                roads[roadsRowItr][roadsColumnItr] = roadsItem;
            }
        }

        int result = cluesOnBinaryPath(n, d, roads);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
