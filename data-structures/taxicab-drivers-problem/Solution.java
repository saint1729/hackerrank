import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int solve(long h, long v, int[][] junctions, int[][] edges) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nhv = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nhv[0]);

        long h = Long.parseLong(nhv[1]);

        long v = Long.parseLong(nhv[2]);

        int[][] junctions = new int[n][2];

        for (int junctionsRowItr = 0; junctionsRowItr < n; junctionsRowItr  ) {
            String[] junctionsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int junctionsColumnItr = 0; junctionsColumnItr < 2; junctionsColumnItr  ) {
                int junctionsItem = Integer.parseInt(junctionsRowItems[junctionsColumnItr]);
                junctions[junctionsRowItr][junctionsColumnItr] = junctionsItem;
            }
        }

        int[][] edges = new int[n-1][2];

        for (int edgesRowItr = 0; edgesRowItr < n-1; edgesRowItr  ) {
            String[] edgesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int edgesColumnItr = 0; edgesColumnItr < 2; edgesColumnItr  ) {
                int edgesItem = Integer.parseInt(edgesRowItems[edgesColumnItr]);
                edges[edgesRowItr][edgesColumnItr] = edgesItem;
            }
        }

        int result = solve(h, v, junctions, edges);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
