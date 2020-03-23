import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        int[] nodes = new int[n];

        String[] nodesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i  ) {
            int nodesItem = Integer.parseInt(nodesItems[i]);
            nodes[i] = nodesItem;
        }

        int[][] edges = new int[n-1][2];

        for (int i = 0; i < n-1; i  ) {
            String[] edgesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j  ) {
                int edgesItem = Integer.parseInt(edgesRowItems[j]);
                edges[i][j] = edgesItem;
            }
        }

        for (int qItr = 0; qItr < q; qItr  ) {
            int u = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int v = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            // Write Your Code Here
        }

        scanner.close();
    }
}
