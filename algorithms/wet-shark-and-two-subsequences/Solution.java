import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the twoSubsequences function below.
     */
    static int twoSubsequences(int[] x, int r, int s) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] mrs = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mrs[0].trim());

        int r = Integer.parseInt(mrs[1].trim());

        int s = Integer.parseInt(mrs[2].trim());

        int[] x = new int[m];

        String[] xItems = scanner.nextLine().split(" ");

        for (int xItr = 0; xItr < m; xItr  ) {
            int xItem = Integer.parseInt(xItems[xItr].trim());
            x[xItr] = xItem;
        }

        int result = twoSubsequences(x, r, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
