import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the jeanisRoute function below.
     */
    static int jeanisRoute(int[] k, int[][] roads) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] city = new int[k];

        String[] cityItems = scanner.nextLine().split(" ");

        for (int cityItr = 0; cityItr < k; cityItr  ) {
            int cityItem = Integer.parseInt(cityItems[cityItr].trim());
            city[cityItr] = cityItem;
        }

        int[][] roads = new int[n-1][3];

        for (int roadsRowItr = 0; roadsRowItr < n-1; roadsRowItr  ) {
            String[] roadsRowItems = scanner.nextLine().split(" ");

            for (int roadsColumnItr = 0; roadsColumnItr < 3; roadsColumnItr  ) {
                int roadsItem = Integer.parseInt(roadsRowItems[roadsColumnItr].trim());
                roads[roadsRowItr][roadsColumnItr] = roadsItem;
            }
        }

        int result = jeanisRoute(k, roads);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
