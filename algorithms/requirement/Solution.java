import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the requirement function below.
     */
    static int requirement(int n, int[][] req) {
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

        int[][] req = new int[m][2];

        for (int reqRowItr = 0; reqRowItr < m; reqRowItr  ) {
            String[] reqRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int reqColumnItr = 0; reqColumnItr < 2; reqColumnItr  ) {
                int reqItem = Integer.parseInt(reqRowItems[reqColumnItr]);
                req[reqRowItr][reqColumnItr] = reqItem;
            }
        }

        int result = requirement(n, req);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
