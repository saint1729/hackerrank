import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the repairRoads function below.
     */
    static int repairRoads(int n, int[][] roads) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int[][] roads = new int[n-1][2];

            for (int roadsRowItr = 0; roadsRowItr < n-1; roadsRowItr  ) {
                String[] roadsRowItems = scanner.nextLine().split(" ");

                for (int roadsColumnItr = 0; roadsColumnItr < 2; roadsColumnItr  ) {
                    int roadsItem = Integer.parseInt(roadsRowItems[roadsColumnItr].trim());
                    roads[roadsRowItr][roadsColumnItr] = roadsItem;
                }
            }

            int result = repairRoads(n, roads);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
