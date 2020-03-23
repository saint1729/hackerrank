import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the verticalRooks function below.
     */
    static String verticalRooks(int[] r1, int[] r2) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int[] r1 = new int[n];

            for (int r1Itr = 0; r1Itr < n; r1Itr  ) {
                int r1Item = Integer.parseInt(scanner.nextLine().trim());
                r1[r1Itr] = r1Item;
            }

            int[] r2 = new int[n];

            for (int r2Itr = 0; r2Itr < n; r2Itr  ) {
                int r2Item = Integer.parseInt(scanner.nextLine().trim());
                r2[r2Itr] = r2Item;
            }

            String result = verticalRooks(r1, r2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
