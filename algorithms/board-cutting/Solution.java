import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the boardCutting function below.
    static int boardCutting(int[] cost_y, int[] cost_x) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr  ) {
            String[] mn = scanner.nextLine().split(" ");

            int m = Integer.parseInt(mn[0]);

            int n = Integer.parseInt(mn[1]);

            int[] cost_y = new int[m-1];

            String[] cost_yItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < m-1; i  ) {
                int cost_yItem = Integer.parseInt(cost_yItems[i]);
                cost_y[i] = cost_yItem;
            }

            int[] cost_x = new int[n-1];

            String[] cost_xItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n-1; i  ) {
                int cost_xItem = Integer.parseInt(cost_xItems[i]);
                cost_x[i] = cost_xItem;
            }

            int result = boardCutting(cost_y, cost_x);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
