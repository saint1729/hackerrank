import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int[] solve(int[][] tree, int[] color, int[] s) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nmr = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nmr[0]);

        int m = Integer.parseInt(nmr[1]);

        int r = Integer.parseInt(nmr[2]);

        int[][] tree = new int[n-1][2];

        for (int treeRowItr = 0; treeRowItr < n-1; treeRowItr  ) {
            String[] treeRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int treeColumnItr = 0; treeColumnItr < 2; treeColumnItr  ) {
                int treeItem = Integer.parseInt(treeRowItems[treeColumnItr]);
                tree[treeRowItr][treeColumnItr] = treeItem;
            }
        }

        int[] color = new int[n];

        for (int colorItr = 0; colorItr < n; colorItr  ) {
            int colorItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            color[colorItr] = colorItem;
        }

        int[] s = new int[m];

        for (int sItr = 0; sItr < m; sItr  ) {
            int sItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            s[sItr] = sItem;
        }

        int[] result = solve(tree, color, s);

        for (int resultItr = 0; resultItr < result.length; resultItr  ) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
