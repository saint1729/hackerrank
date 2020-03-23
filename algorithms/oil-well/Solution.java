import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the oilWell function below.
     */
    static int oilWell(int[][] blocks) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] rc = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int r = Integer.parseInt(rc[0]);

        int c = Integer.parseInt(rc[1]);

        int[][] blocks = new int[r][c];

        for (int blocksRowItr = 0; blocksRowItr < r; blocksRowItr  ) {
            String[] blocksRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int blocksColumnItr = 0; blocksColumnItr < c; blocksColumnItr  ) {
                int blocksItem = Integer.parseInt(blocksRowItems[blocksColumnItr]);
                blocks[blocksRowItr][blocksColumnItr] = blocksItem;
            }
        }

        int result = oilWell(blocks);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
