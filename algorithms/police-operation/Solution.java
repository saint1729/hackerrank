import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the policeOperation function below.
     */
    static int policeOperation(int h, int[] criminals) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nh = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(nh[0]);

        int h = Integer.parseInt(nh[1]);

        int[] criminals = new int[n];

        String[] criminalsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int criminalsItr = 0; criminalsItr < n; criminalsItr  ) {
            int criminalsItem = Integer.parseInt(criminalsItems[criminalsItr]);
            criminals[criminalsItr] = criminalsItem;
        }

        int result = policeOperation(h, criminals);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
