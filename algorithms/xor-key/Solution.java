import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the xorKey function below.
     */
    static long[] xorKey(long[] x, long[][] queries) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            String[] nq = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nq[0].trim());

            int q = Integer.parseInt(nq[1].trim());

            long[] x = new long[n];

            String[] xItems = scanner.nextLine().split(" ");

            for (int xItr = 0; xItr < n; xItr  ) {
                long xItem = Long.parseLong(xItems[xItr].trim());
                x[xItr] = xItem;
            }

            long[][] queries = new long[q][3];

            for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr  ) {
                String[] queriesRowItems = scanner.nextLine().split(" ");

                for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr  ) {
                    long queriesItem = Long.parseLong(queriesRowItems[queriesColumnItr].trim());
                    queries[queriesRowItr][queriesColumnItr] = queriesItem;
                }
            }

            long[] result = xorKey(x, queries);

            for (int resultItr = 0; resultItr < result.length; resultItr  ) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write("\n");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
