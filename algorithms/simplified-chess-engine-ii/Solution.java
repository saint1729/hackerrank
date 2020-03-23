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
        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr  ) {
            String[] wbm = scanner.nextLine().split(" ");

            int w = Integer.parseInt(wbm[0]);

            int b = Integer.parseInt(wbm[1]);

            int m = Integer.parseInt(wbm[2]);

            String[][] white = new String[w][3];

            for (int i = 0; i < w; i  ) {
                String[] whiteRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 3; j  ) {
                    String whiteItem = whiteRowItems[j];
                    white[i][j] = whiteItem;
                }
            }

            String[][] black = new String[b][3];

            for (int i = 0; i < b; i  ) {
                String[] blackRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 3; j  ) {
                    String blackItem = blackRowItems[j];
                    black[i][j] = blackItem;
                }
            }

            // Write Your Code Here
        }

        scanner.close();
    }
}
