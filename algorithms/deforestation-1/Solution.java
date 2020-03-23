import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the deforestation function below.
     */
    static String deforestation(int n, int[][] tree) {
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

            int[][] tree = new int[n-1][2];

            for (int treeRowItr = 0; treeRowItr < n-1; treeRowItr  ) {
                String[] treeRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int treeColumnItr = 0; treeColumnItr < 2; treeColumnItr  ) {
                    int treeItem = Integer.parseInt(treeRowItems[treeColumnItr]);
                    tree[treeRowItr][treeColumnItr] = treeItem;
                }
            }

            String result = deforestation(n, tree);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
