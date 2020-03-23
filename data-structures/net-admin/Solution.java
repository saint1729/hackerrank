import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static String[] solve(int s, int a, int[][] links, int[][] queries) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] slat = scanner.nextLine().split(" ");

        int s = Integer.parseInt(slat[0]);

        int l = Integer.parseInt(slat[1]);

        int a = Integer.parseInt(slat[2]);

        int t = Integer.parseInt(slat[3]);

        int[][] links = new int[l][3];

        for (int linksRowItr = 0; linksRowItr < l; linksRowItr  ) {
            String[] linksRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int linksColumnItr = 0; linksColumnItr < 3; linksColumnItr  ) {
                int linksItem = Integer.parseInt(linksRowItems[linksColumnItr]);
                links[linksRowItr][linksColumnItr] = linksItem;
            }
        }

        int[][] queries = new int[t][4];

        for (int queriesRowItr = 0; queriesRowItr < t; queriesRowItr  ) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int queriesColumnItr = 0; queriesColumnItr < 4; queriesColumnItr  ) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr]);
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        String[] result = solve(s, a, links, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr  ) {
            bufferedWriter.write(result[resultItr]);

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
