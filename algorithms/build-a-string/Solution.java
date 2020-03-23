import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the buildString function below.
     */
    static int buildString(int a, int b, String s) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            String[] nab = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nab[0].trim());

            int a = Integer.parseInt(nab[1].trim());

            int b = Integer.parseInt(nab[2].trim());

            String s = scanner.nextLine();

            int result = buildString(a, b, s);
        }

        bufferedWriter.close();
    }
}
