import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the jennysSubtrees function below.
     */
    static int jennysSubtrees(int n, int r, int[][] edges) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nr[0].trim());

        int r = Integer.parseInt(nr[1].trim());

        int[][] edges = new int[n-1][2];

        for (int edgesRowItr = 0; edgesRowItr < n-1; edgesRowItr  ) {
            String[] edgesRowItems = scanner.nextLine().split(" ");

            for (int edgesColumnItr = 0; edgesColumnItr < 2; edgesColumnItr  ) {
                int edgesItem = Integer.parseInt(edgesRowItems[edgesColumnItr].trim());
                edges[edgesRowItr][edgesColumnItr] = edgesItem;
            }
        }

        int result = jennysSubtrees(n, r, edges);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
