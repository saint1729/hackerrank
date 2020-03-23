import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the bobAndBen function below.
     */
    static String bobAndBen(int[][] trees) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int gItr = 0; gItr < g; gItr  ) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int[][] trees = new int[n][2];

            for (int treesRowItr = 0; treesRowItr < n; treesRowItr  ) {
                String[] treesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int treesColumnItr = 0; treesColumnItr < 2; treesColumnItr  ) {
                    int treesItem = Integer.parseInt(treesRowItems[treesColumnItr]);
                    trees[treesRowItr][treesColumnItr] = treesItem;
                }
            }

            String result = bobAndBen(trees);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
