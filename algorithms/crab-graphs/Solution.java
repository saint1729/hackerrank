import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the crabGraphs function below.
     */
    static int crabGraphs(int n, int t, int[][] graph) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int c = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int cItr = 0; cItr < c; cItr  ) {
            String[] ntm = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int n = Integer.parseInt(ntm[0]);

            int t = Integer.parseInt(ntm[1]);

            int m = Integer.parseInt(ntm[2]);

            int[][] graph = new int[m][2];

            for (int graphRowItr = 0; graphRowItr < m; graphRowItr  ) {
                String[] graphRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int graphColumnItr = 0; graphColumnItr < 2; graphColumnItr  ) {
                    int graphItem = Integer.parseInt(graphRowItems[graphColumnItr]);
                    graph[graphRowItr][graphColumnItr] = graphItem;
                }
            }

            int result = crabGraphs(n, t, graph);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
