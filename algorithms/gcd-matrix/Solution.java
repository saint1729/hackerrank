import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nmq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nmq[0]);

        int m = Integer.parseInt(nmq[1]);

        int q = Integer.parseInt(nmq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i  ) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i  ) {
            int bItem = Integer.parseInt(bItems[i]);
            b[i] = bItem;
        }

        for (int qItr = 0; qItr < q; qItr  ) {
            String[] r1C1R2C2 = scanner.nextLine().split(" ");

            int r1 = Integer.parseInt(r1C1R2C2[0]);

            int c1 = Integer.parseInt(r1C1R2C2[1]);

            int r2 = Integer.parseInt(r1C1R2C2[2]);

            int c2 = Integer.parseInt(r1C1R2C2[3]);

            // Write Your Code Here
        }

        scanner.close();
    }
}
