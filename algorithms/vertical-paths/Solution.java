import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the verticalPaths function below.
     */
    static int verticalPaths(int n, int[][] paths, int[][] edges) {
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
            String[] nm = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] paths = new int[n-1][3];

            for (int pathsRowItr = 0; pathsRowItr < n-1; pathsRowItr  ) {
                String[] pathsRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int pathsColumnItr = 0; pathsColumnItr < 3; pathsColumnItr  ) {
                    int pathsItem = Integer.parseInt(pathsRowItems[pathsColumnItr]);
                    paths[pathsRowItr][pathsColumnItr] = pathsItem;
                }
            }

            int[][] edges = new int[m][3];

            for (int edgesRowItr = 0; edgesRowItr < m; edgesRowItr  ) {
                String[] edgesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int edgesColumnItr = 0; edgesColumnItr < 3; edgesColumnItr  ) {
                    int edgesItem = Integer.parseInt(edgesRowItems[edgesColumnItr]);
                    edges[edgesRowItr][edgesColumnItr] = edgesItem;
                }
            }

            int result = verticalPaths(n, paths, edges);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
