import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulPath function below.
    static int beautifulPath(int[][] edges, int A, int B) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] edges = new int[m][3];

        for (int i = 0; i < m; i  ) {
            String[] edgesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j  ) {
                int edgesItem = Integer.parseInt(edgesRowItems[j]);
                edges[i][j] = edgesItem;
            }
        }

        String[] AB = scanner.nextLine().split(" ");

        int A = Integer.parseInt(AB[0]);

        int B = Integer.parseInt(AB[1]);

        int result = beautifulPath(edges, A, B);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
