import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int solve(int[][] tree) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] tree = new int[n-1][2];

        for (int treeRowItr = 0; treeRowItr < n-1; treeRowItr  ) {
            String[] treeRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int treeColumnItr = 0; treeColumnItr < 2; treeColumnItr  ) {
                int treeItem = Integer.parseInt(treeRowItems[treeColumnItr]);
                tree[treeRowItr][treeColumnItr] = treeItem;
            }
        }

        int result = solve(tree);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
