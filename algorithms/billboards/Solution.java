import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the billboards function below.
     */
    static int billboards(int k, int[] revenue) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] revenue = new int[n];

        for (int revenueItr = 0; revenueItr < n; revenueItr  ) {
            int revenueItem = Integer.parseInt(scanner.nextLine().trim());
            revenue[revenueItr] = revenueItem;
        }

        int result = billboards(k, revenue);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
