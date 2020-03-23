import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the treeSplitting function below.
     */
    static int[] treeSplitting(int n, int[][] edges, int[] queries) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int[][] edges = new int[n-1][2];

        for (int edgesRowItr = 0; edgesRowItr < n-1; edgesRowItr  ) {
            String[] edgesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int edgesColumnItr = 0; edgesColumnItr < 2; edgesColumnItr  ) {
                int edgesItem = Integer.parseInt(edgesRowItems[edgesColumnItr]);
                edges[edgesRowItr][edgesColumnItr] = edgesItem;
            }
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int[] queries = new int[queriesCount];

        for (int queriesItr = 0; queriesItr < queriesCount; queriesItr  ) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
            queries[queriesItr] = queriesItem;
        }

        int[] result = treeSplitting(n, edges, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr  ) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
