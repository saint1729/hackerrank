import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the journeyScheduling function below.
     */
    static int[] journeyScheduling(int n, int[][] roads, int[][] journeys) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] roads = new int[n-1][2];

        for (int roadsRowItr = 0; roadsRowItr < n-1; roadsRowItr  ) {
            String[] roadsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int roadsColumnItr = 0; roadsColumnItr < 2; roadsColumnItr  ) {
                int roadsItem = Integer.parseInt(roadsRowItems[roadsColumnItr]);
                roads[roadsRowItr][roadsColumnItr] = roadsItem;
            }
        }

        int[][] journeys = new int[m][2];

        for (int journeysRowItr = 0; journeysRowItr < m; journeysRowItr  ) {
            String[] journeysRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int journeysColumnItr = 0; journeysColumnItr < 2; journeysColumnItr  ) {
                int journeysItem = Integer.parseInt(journeysRowItems[journeysColumnItr]);
                journeys[journeysRowItr][journeysColumnItr] = journeysItem;
            }
        }

        int[] result = journeyScheduling(n, roads, journeys);

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
