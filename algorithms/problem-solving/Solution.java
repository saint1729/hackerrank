import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the problemSolving function below.
     */
    static int problemSolving(int k, int[] v) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] v = new int[n];

        String[] vItems = scanner.nextLine().split(" ");

        for (int vItr = 0; vItr < n; vItr  ) {
            int vItem = Integer.parseInt(vItems[vItr].trim());
            v[vItr] = vItem;
        }

        int result = problemSolving(k, v);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
