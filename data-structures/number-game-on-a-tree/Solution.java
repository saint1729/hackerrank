import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the numberGameOnATree function below.
     */
    static int numberGameOnATree(int n, int[][] edges) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr  ) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int[][] edges = new int[n-1][3];

            for (int edgesRowItr = 0; edgesRowItr < n-1; edgesRowItr  ) {
                String[] edgesRowItems = scanner.nextLine().split(" ");

                for (int edgesColumnItr = 0; edgesColumnItr < 3; edgesColumnItr  ) {
                    int edgesItem = Integer.parseInt(edgesRowItems[edgesColumnItr].trim());
                    edges[edgesRowItr][edgesColumnItr] = edgesItem;
                }
            }

            int result = numberGameOnATree(n, edges);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
