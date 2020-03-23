import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the stoneDivision function below.
     */
    static String stoneDivision(long n, long[] s) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        long n = Long.parseLong(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        long[] s = new long[m];

        String[] sItems = scanner.nextLine().split(" ");

        for (int sItr = 0; sItr < m; sItr  ) {
            long sItem = Long.parseLong(sItems[sItr].trim());
            s[sItr] = sItem;
        }

        String result = stoneDivision(n, s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
