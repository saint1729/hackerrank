import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the virusIndices function below.
     */
    static void virusIndices(String p, String v) {
        /*
         * Print the answer for this test case in a single line
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            String[] pv = scanner.nextLine().split(" ");

            String p = pv[0];

            String v = pv[1];

            virusIndices(p, v);
        }
    }
}
