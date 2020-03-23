import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the solve function below.
     */
    static int solve(int[] t) {
        /*
         * Return the ID
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tCount = Integer.parseInt(scanner.nextLine().trim());

        int[] t = new int[tCount];

        String[] tItems = scanner.nextLine().split(" ");

        for (int tItr = 0; tItr < tCount; tItr  ) {
            int tItem = Integer.parseInt(tItems[tItr].trim());
            t[tItr] = tItem;
        }

        int id = solve(t);

        bufferedWriter.write(String.valueOf(id));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
