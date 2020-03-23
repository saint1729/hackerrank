import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the missileDefend function below.
     */
    static int missileDefend(int[][] missiles) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int[][] missiles = new int[n][2];

        for (int missilesRowItr = 0; missilesRowItr < n; missilesRowItr  ) {
            String[] missilesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int missilesColumnItr = 0; missilesColumnItr < 2; missilesColumnItr  ) {
                int missilesItem = Integer.parseInt(missilesRowItems[missilesColumnItr]);
                missiles[missilesRowItr][missilesColumnItr] = missilesItem;
            }
        }

        int result = missileDefend(missiles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
