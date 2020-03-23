import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int[] solve(int[] a, int[][] queries) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int aItr = 0; aItr < n; aItr  ) {
            int aItem = Integer.parseInt(aItems[aItr]);
            a[aItr] = aItem;
        }

        int[][] queries = new int[m][2];

        for (int queriesRowItr = 0; queriesRowItr < m; queriesRowItr  ) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr  ) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr]);
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = solve(a, queries);

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
