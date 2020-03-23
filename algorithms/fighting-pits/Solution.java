import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the fightingPits function below.
     */
    static int[] fightingPits(int k, int[][] fighters, int[][] queries) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0].trim());

        int k = Integer.parseInt(nkq[1].trim());

        int q = Integer.parseInt(nkq[2].trim());

        int[][] fighters = new int[n][2];

        for (int fightersRowItr = 0; fightersRowItr < n; fightersRowItr  ) {
            String[] fightersRowItems = scanner.nextLine().split(" ");

            for (int fightersColumnItr = 0; fightersColumnItr < 2; fightersColumnItr  ) {
                int fightersItem = Integer.parseInt(fightersRowItems[fightersColumnItr].trim());
                fighters[fightersRowItr][fightersColumnItr] = fightersItem;
            }
        }

        int[][] queries = new int[q][3];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr  ) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr  ) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = fightingPits(k, fighters, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr  ) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
