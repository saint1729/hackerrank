import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int solve(int[][] roads, int[][] tickets) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] roads = new int[n-1][3];

        for (int roadsRowItr = 0; roadsRowItr < n-1; roadsRowItr  ) {
            String[] roadsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int roadsColumnItr = 0; roadsColumnItr < 3; roadsColumnItr  ) {
                int roadsItem = Integer.parseInt(roadsRowItems[roadsColumnItr]);
                roads[roadsRowItr][roadsColumnItr] = roadsItem;
            }
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] tickets = new int[m][3];

        for (int ticketsRowItr = 0; ticketsRowItr < m; ticketsRowItr  ) {
            String[] ticketsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int ticketsColumnItr = 0; ticketsColumnItr < 3; ticketsColumnItr  ) {
                int ticketsItem = Integer.parseInt(ticketsRowItems[ticketsColumnItr]);
                tickets[ticketsRowItr][ticketsColumnItr] = ticketsItem;
            }
        }

        int result = solve(roads, tickets);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
