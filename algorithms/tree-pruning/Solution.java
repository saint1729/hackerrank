import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the treePrunning function below.
     */
    static int treePrunning(int k, int[] weights, int[][] tree) {
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

        int[] weights = new int[n];

        String[] weightsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int weightsItr = 0; weightsItr < n; weightsItr  ) {
            int weightsItem = Integer.parseInt(weightsItems[weightsItr]);
            weights[weightsItr] = weightsItem;
        }

        int[][] tree = new int[n-1][2];

        for (int treeRowItr = 0; treeRowItr < n-1; treeRowItr  ) {
            String[] treeRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int treeColumnItr = 0; treeColumnItr < 2; treeColumnItr  ) {
                int treeItem = Integer.parseInt(treeRowItems[treeColumnItr]);
                tree[treeRowItr][treeColumnItr] = treeItem;
            }
        }

        int result = treePrunning(k, weights, tree);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
