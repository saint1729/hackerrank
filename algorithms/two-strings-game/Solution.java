import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the twoStrings function below.
     */
    static String[] twoStrings(long k, String a, String b) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nmk = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(nmk[0]);

        int m = Integer.parseInt(nmk[1]);

        long k = Long.parseLong(nmk[2]);

        String a = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        String b = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        String[] result = twoStrings(k, a, b);

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
