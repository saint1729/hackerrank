import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the gridWalking function below.
     */
    static int gridWalking(int m, int[] x, int[] D) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0].trim());

            int m = Integer.parseInt(nm[1].trim());

            int[] x = new int[n];

            String[] xItems = scanner.nextLine().split(" ");

            for (int xItr = 0; xItr < n; xItr  ) {
                int xItem = Integer.parseInt(xItems[xItr].trim());
                x[xItr] = xItem;
            }

            int[] D = new int[n];

            String[] DItems = scanner.nextLine().split(" ");

            for (int DItr = 0; DItr < n; DItr  ) {
                int DItem = Integer.parseInt(DItems[DItr].trim());
                D[DItr] = DItem;
            }

            int result = gridWalking(m, x, D);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
