import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the squareBoard function below.
     */
    static String squareBoard(int[][] board) {
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
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int[][] board = new int[n][n];

            for (int boardRowItr = 0; boardRowItr < n; boardRowItr  ) {
                String[] boardRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int boardColumnItr = 0; boardColumnItr < n; boardColumnItr  ) {
                    int boardItem = Integer.parseInt(boardRowItems[boardColumnItr]);
                    board[boardRowItr][boardColumnItr] = boardItem;
                }
            }

            String result = squareBoard(board);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
