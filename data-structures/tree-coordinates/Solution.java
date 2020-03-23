import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the treeCoordinates function below.
     */
    static int treeCoordinates(int n, int[][] edges, int[][] points) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[][] edges = new int[n-1][2];

        for (int edgesRowItr = 0; edgesRowItr < n-1; edgesRowItr  ) {
            String[] edgesRowItems = scanner.nextLine().split(" ");

            for (int edgesColumnItr = 0; edgesColumnItr < 2; edgesColumnItr  ) {
                int edgesItem = Integer.parseInt(edgesRowItems[edgesColumnItr].trim());
                edges[edgesRowItr][edgesColumnItr] = edgesItem;
            }
        }

        int[][] points = new int[m][2];

        for (int pointsRowItr = 0; pointsRowItr < m; pointsRowItr  ) {
            String[] pointsRowItems = scanner.nextLine().split(" ");

            for (int pointsColumnItr = 0; pointsColumnItr < 2; pointsColumnItr  ) {
                int pointsItem = Integer.parseInt(pointsRowItems[pointsColumnItr].trim());
                points[pointsRowItr][pointsColumnItr] = pointsItem;
            }
        }

        int result = treeCoordinates(n, edges, points);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
