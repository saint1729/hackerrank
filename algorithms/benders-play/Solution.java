import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the bendersPlay function below.
     */
    static String bendersPlay(int n, int[][] paths, int[] query) {
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

        int[][] paths = new int[m][2];

        for (int pathsRowItr = 0; pathsRowItr < m; pathsRowItr  ) {
            String[] pathsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int pathsColumnItr = 0; pathsColumnItr < 2; pathsColumnItr  ) {
                int pathsItem = Integer.parseInt(pathsRowItems[pathsColumnItr]);
                paths[pathsRowItr][pathsColumnItr] = pathsItem;
            }
        }

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int qItr = 0; qItr < q; qItr  ) {
            int queryCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int[] query = new int[queryCount];

            String[] queryItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int queryItr = 0; queryItr < queryCount; queryItr  ) {
                int queryItem = Integer.parseInt(queryItems[queryItr]);
                query[queryItr] = queryItem;
            }

            String result = bendersPlay(n, paths, query);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
