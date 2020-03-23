import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the huarongdao function below.
     */
    static int huarongdao(int k, int[][] board, int[][] queries) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nmkq = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(nmkq[0]);

        int m = Integer.parseInt(nmkq[1]);

        int k = Integer.parseInt(nmkq[2]);

        int q = Integer.parseInt(nmkq[3]);

        int[][] board = new int[n][m];

        for (int boardRowItr = 0; boardRowItr < n; boardRowItr  ) {
            String[] boardRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int boardColumnItr = 0; boardColumnItr < m; boardColumnItr  ) {
                int boardItem = Integer.parseInt(boardRowItems[boardColumnItr]);
                board[boardRowItr][boardColumnItr] = boardItem;
            }
        }

        int[][] queries = new int[q][6];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr  ) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int queriesColumnItr = 0; queriesColumnItr < 6; queriesColumnItr  ) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr]);
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int result = huarongdao(k, board, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
