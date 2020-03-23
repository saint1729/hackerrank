import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the superHero function below.
     */
    static int superHero(int[][] power, int[][] bullets) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int tItr = 0; tItr < t; tItr  ) {
            String[] nm = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] power = new int[n][m];

            for (int powerRowItr = 0; powerRowItr < n; powerRowItr  ) {
                String[] powerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int powerColumnItr = 0; powerColumnItr < m; powerColumnItr  ) {
                    int powerItem = Integer.parseInt(powerRowItems[powerColumnItr]);
                    power[powerRowItr][powerColumnItr] = powerItem;
                }
            }

            int[][] bullets = new int[n][m];

            for (int bulletsRowItr = 0; bulletsRowItr < n; bulletsRowItr  ) {
                String[] bulletsRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int bulletsColumnItr = 0; bulletsColumnItr < m; bulletsColumnItr  ) {
                    int bulletsItem = Integer.parseInt(bulletsRowItems[bulletsColumnItr]);
                    bullets[bulletsRowItr][bulletsColumnItr] = bulletsItem;
                }
            }

            int result = superHero(power, bullets);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
