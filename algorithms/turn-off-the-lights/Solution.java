import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the turnOffTheLights function below.
     */
    static long turnOffTheLights(int k, int[] c) {
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

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");

        for (int cItr = 0; cItr < n; cItr  ) {
            int cItem = Integer.parseInt(cItems[cItr].trim());
            c[cItr] = cItem;
        }

        long result = turnOffTheLights(k, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
