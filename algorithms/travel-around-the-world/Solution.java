import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the travelAroundTheWorld function below.
     */
    static int travelAroundTheWorld(int[] a, int[] b, long c) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nc = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nc[0].trim());

        long c = Long.parseLong(nc[1].trim());

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr  ) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[n];

        String[] bItems = scanner.nextLine().split(" ");

        for (int bItr = 0; bItr < n; bItr  ) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int result = travelAroundTheWorld(a, b, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
