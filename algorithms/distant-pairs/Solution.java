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
        String[] nc = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nc[0]);

        int c = Integer.parseInt(nc[1]);

        int[][] points = new int[n][2];

        for (int i = 0; i < n; i  ) {
            String[] pointsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j  ) {
                int pointsItem = Integer.parseInt(pointsRowItems[j]);
                points[i][j] = pointsItem;
            }
        }

        // Write Your Code Here

        scanner.close();
    }
}
