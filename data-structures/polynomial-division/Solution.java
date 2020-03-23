import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the polynomialDivision function below.
    static String[] polynomialDivision(int a, int b, int[][] queries) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nabq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nabq[0]);

        int a = Integer.parseInt(nabq[1]);

        int b = Integer.parseInt(nabq[2]);

        int q = Integer.parseInt(nabq[3]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i  ) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int[][] queries = new int[q][3];

        for (int i = 0; i < q; i  ) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j  ) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        String[] result = polynomialDivision(a, b, queries);

        for (int i = 0; i < result.length; i  ) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
