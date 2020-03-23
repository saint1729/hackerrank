import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the chessboardGame function below.
     */
    static String chessboardGame(int[][] coins) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            int k = Integer.parseInt(scanner.nextLine().trim());

            int[][] coins = new int[k][2];

            for (int coinsRowItr = 0; coinsRowItr < k; coinsRowItr  ) {
                String[] coinsRowItems = scanner.nextLine().split(" ");

                for (int coinsColumnItr = 0; coinsColumnItr < 2; coinsColumnItr  ) {
                    int coinsItem = Integer.parseInt(coinsRowItems[coinsColumnItr].trim());
                    coins[coinsRowItr][coinsColumnItr] = coinsItem;
                }
            }

            String result = chessboardGame(coins);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
