import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countArray function below.
    static long countArray(int n, int k, int x) {
        // Return the number of ways to fill in the array.

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkx = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkx[0]);

        int k = Integer.parseInt(nkx[1]);

        int x = Integer.parseInt(nkx[2]);

        long answer = countArray(n, k, x);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
