import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the rustMurdered function below.
     */
    static int[] rustMurdered(int n, int[][] roads) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0].trim());

            int m = Integer.parseInt(nm[1].trim());

            int[][] roads = new int[m][2];

            for (int roadsRowItr = 0; roadsRowItr < m; roadsRowItr  ) {
                String[] roadsRowItems = scanner.nextLine().split(" ");

                for (int roadsColumnItr = 0; roadsColumnItr < 2; roadsColumnItr  ) {
                    int roadsItem = Integer.parseInt(roadsRowItems[roadsColumnItr].trim());
                    roads[roadsRowItr][roadsColumnItr] = roadsItem;
                }
            }

            int s = Integer.parseInt(scanner.nextLine().trim());

            int[] result = rustMurderer(n, roads);

            for (int resultItr = 0; resultItr < result.length; resultItr  ) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
