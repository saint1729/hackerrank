import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the demandingMoney function below.
     */
    static int[] demandingMoney(int[] money, int[][] roads) {
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

        int[] money = new int[n];

        String[] moneyItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int moneyItr = 0; moneyItr < n; moneyItr  ) {
            int moneyItem = Integer.parseInt(moneyItems[moneyItr]);
            money[moneyItr] = moneyItem;
        }

        int[][] roads = new int[m][2];

        for (int roadsRowItr = 0; roadsRowItr < m; roadsRowItr  ) {
            String[] roadsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int roadsColumnItr = 0; roadsColumnItr < 2; roadsColumnItr  ) {
                int roadsItem = Integer.parseInt(roadsRowItems[roadsColumnItr]);
                roads[roadsRowItr][roadsColumnItr] = roadsItem;
            }
        }

        int[] result = demandingMoney(money, roads);

        for (int resultItr = 0; resultItr < result.length; resultItr  ) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
