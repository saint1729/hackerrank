import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int[] solve(int v, int[][] ships, int[][] queries) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nqv = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nqv[0]);

        int q = Integer.parseInt(nqv[1]);

        int v = Integer.parseInt(nqv[2]);

        int[][] ships = new int[n][3];

        for (int shipsRowItr = 0; shipsRowItr < n; shipsRowItr  ) {
            String[] shipsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int shipsColumnItr = 0; shipsColumnItr < 3; shipsColumnItr  ) {
                int shipsItem = Integer.parseInt(shipsRowItems[shipsColumnItr]);
                ships[shipsRowItr][shipsColumnItr] = shipsItem;
            }
        }

        int[][] queries = new int[q][3];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr  ) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr  ) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr]);
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = solve(v, ships, queries);

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
