import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the coinOnTheTable function below.
     */
    static int coinOnTheTable(int m, int k, String[] board) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nmk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nmk[0].trim());

        int m = Integer.parseInt(nmk[1].trim());

        int k = Integer.parseInt(nmk[2].trim());

        String[] board = new String[n];

        for (int boardItr = 0; boardItr < n; boardItr  ) {
            String boardItem = scanner.nextLine();
            board[boardItr] = boardItem;
        }

        int result = coinOnTheTable(m, k, board);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
