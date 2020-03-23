import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the jumpingRooks function below.
     */
    static int jumpingRooks(int k, String[] board) {
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

        String[] board = new String[n];

        for (int boardItr = 0; boardItr < n; boardItr  ) {
            String boardItem = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
            board[boardItr] = boardItem;
        }

        int result = jumpingRooks(k, board);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
