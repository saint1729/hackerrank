import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the roadsInHackerland function below.
     */
    static String roadsInHackerland(int n, int[][] roads) {
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

        int[][] roads = new int[m][3];

        for (int roadsRowItr = 0; roadsRowItr < m; roadsRowItr  ) {
            String[] roadsRowItems = scanner.nextLine().split(" ");

            for (int roadsColumnItr = 0; roadsColumnItr < 3; roadsColumnItr  ) {
                int roadsItem = Integer.parseInt(roadsRowItems[roadsColumnItr].trim());
                roads[roadsRowItr][roadsColumnItr] = roadsItem;
            }
        }

        String result = roadsInHackerland(n, roads);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
