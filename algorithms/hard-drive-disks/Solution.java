import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the hardDrive function below.
     */
    static int hardDrive(int k, int[][] hdds) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] hdds = new int[n][2];

        for (int hddsRowItr = 0; hddsRowItr < n; hddsRowItr  ) {
            String[] hddsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int hddsColumnItr = 0; hddsColumnItr < 2; hddsColumnItr  ) {
                int hddsItem = Integer.parseInt(hddsRowItems[hddsColumnItr]);
                hdds[hddsRowItr][hddsColumnItr] = hddsItem;
            }
        }

        int result = hardDrive(k, hdds);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
