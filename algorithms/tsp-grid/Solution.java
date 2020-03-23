import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the tspGrid function below.
     */
    static int tspGrid(int[][] horizontal, int[][] vertical) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] mn = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[][] horizontal = new int[m][n-1];

        for (int horizontalRowItr = 0; horizontalRowItr < m; horizontalRowItr  ) {
            String[] horizontalRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int horizontalColumnItr = 0; horizontalColumnItr < n-1; horizontalColumnItr  ) {
                int horizontalItem = Integer.parseInt(horizontalRowItems[horizontalColumnItr]);
                horizontal[horizontalRowItr][horizontalColumnItr] = horizontalItem;
            }
        }

        int[][] vertical = new int[m-1][n];

        for (int verticalRowItr = 0; verticalRowItr < m-1; verticalRowItr  ) {
            String[] verticalRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int verticalColumnItr = 0; verticalColumnItr < n; verticalColumnItr  ) {
                int verticalItem = Integer.parseInt(verticalRowItems[verticalColumnItr]);
                vertical[verticalRowItr][verticalColumnItr] = verticalItem;
            }
        }

        int result = tspGrid(horizontal, vertical);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
