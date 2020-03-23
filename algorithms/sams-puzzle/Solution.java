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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] puzzle = new int[n][n];

        for (int i = 0; i < n; i  ) {
            String[] puzzleRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j  ) {
                int puzzleItem = Integer.parseInt(puzzleRowItems[j]);
                puzzle[i][j] = puzzleItem;
            }
        }

        // Write Your Code Here

        scanner.close();
    }
}
