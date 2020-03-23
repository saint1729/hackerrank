import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the bestSpot function below.
     */
    static void bestSpot(int[][] heights, int[][] store) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] rc = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int r = Integer.parseInt(rc[0]);

        int c = Integer.parseInt(rc[1]);

        int[][] heights = new int[r][c];

        for (int heightsRowItr = 0; heightsRowItr < r; heightsRowItr  ) {
            String[] heightsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int heightsColumnItr = 0; heightsColumnItr < c; heightsColumnItr  ) {
                int heightsItem = Integer.parseInt(heightsRowItems[heightsColumnItr]);
                heights[heightsRowItr][heightsColumnItr] = heightsItem;
            }
        }

        String[] hw = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int h = Integer.parseInt(hw[0]);

        int w = Integer.parseInt(hw[1]);

        int[][] store = new int[h][w];

        for (int storeRowItr = 0; storeRowItr < h; storeRowItr  ) {
            String[] storeRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int storeColumnItr = 0; storeColumnItr < w; storeColumnItr  ) {
                int storeItem = Integer.parseInt(storeRowItems[storeColumnItr]);
                store[storeRowItr][storeColumnItr] = storeItem;
            }
        }

        bestSpot(heights, store);

        scanner.close();
    }
}
