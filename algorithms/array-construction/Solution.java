import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the arrayConstruction function below.
     */
    static int[] arrayConstruction(int n, int s, int k) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int qItr = 0; qItr < q; qItr  ) {
            String[] nsk = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int n = Integer.parseInt(nsk[0]);

            int s = Integer.parseInt(nsk[1]);

            int k = Integer.parseInt(nsk[2]);

            int[] result = arrayConstruction(n, s, k);

            for (int resultItr = 0; resultItr < result.length; resultItr  ) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
