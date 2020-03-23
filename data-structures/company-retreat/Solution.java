import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int solve(int[] supervisors, int[][] groups) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] supervisors = new int[n-1];

        String[] supervisorsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int supervisorsItr = 0; supervisorsItr < n-1; supervisorsItr  ) {
            int supervisorsItem = Integer.parseInt(supervisorsItems[supervisorsItr]);
            supervisors[supervisorsItr] = supervisorsItem;
        }

        int[][] groups = new int[m][2];

        for (int groupsRowItr = 0; groupsRowItr < m; groupsRowItr  ) {
            String[] groupsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int groupsColumnItr = 0; groupsColumnItr < 2; groupsColumnItr  ) {
                int groupsItem = Integer.parseInt(groupsRowItems[groupsColumnItr]);
                groups[groupsRowItr][groupsColumnItr] = groupsItem;
            }
        }

        int result = solve(supervisors, groups);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
