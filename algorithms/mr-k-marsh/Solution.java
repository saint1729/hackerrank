import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the kMarsh function below.
     */
    static void kMarsh(String[] grid) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0].trim());

        int n = Integer.parseInt(mn[1].trim());

        String[] grid = new String[m];

        for (int gridItr = 0; gridItr < m; gridItr  ) {
            String gridItem = scanner.nextLine();
            grid[gridItr] = gridItem;
        }

        kMarsh(grid);
    }
}
