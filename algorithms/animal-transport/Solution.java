import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumZooNumbers function below.
    static int[] minimumZooNumbers(int m, int n, char[] t, int[] s, int[] d) {
        // Return a list of length n consisting of the answers

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int cases = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int casesItr = 0; casesItr < cases; casesItr  ) {
            String[] mn = scanner.nextLine().split(" ");

            int m = Integer.parseInt(mn[0]);

            int n = Integer.parseInt(mn[1]);

            char[] t = new char[n];

            String[] tItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i  ) {
                String tItemStr = tItems[i];

                char tItem = tItemStr.charAt(0);
                t[i] = tItem;
            }

            int[] s = new int[n];

            String[] sItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i  ) {
                int sItem = Integer.parseInt(sItems[i]);
                s[i] = sItem;
            }

            int[] d = new int[n];

            String[] dItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i  ) {
                int dItem = Integer.parseInt(dItems[i]);
                d[i] = dItem;
            }

            int[] result = minimumZooNumbers(m, n, t, s, d);

            for (int i = 0; i < result.length; i  ) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
