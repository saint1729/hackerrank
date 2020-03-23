import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the extremumPermutations function below.
     */
    static int extremumPermutations(int n, int[] a, int[] b) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkl = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int n = Integer.parseInt(nkl[0]);

        int k = Integer.parseInt(nkl[1]);

        int l = Integer.parseInt(nkl[2]);

        int[] a = new int[k];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int aItr = 0; aItr < k; aItr  ) {
            int aItem = Integer.parseInt(aItems[aItr]);
            a[aItr] = aItem;
        }

        int[] b = new int[l];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int bItr = 0; bItr < l; bItr  ) {
            int bItem = Integer.parseInt(bItems[bItr]);
            b[bItr] = bItem;
        }

        int result = extremumPermutations(n, a, b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
