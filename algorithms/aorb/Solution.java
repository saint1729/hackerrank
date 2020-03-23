import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the aOrB function below.
     */
    static void aOrB(int k, String a, String b, String c) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr  ) {
            int k = Integer.parseInt(scanner.nextLine().trim());

            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String c = scanner.nextLine();

            aOrB(k, a, b, c);
        }
    }
}
