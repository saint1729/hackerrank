import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the findConnectedComponents function below.
    static int findConnectedComponents(long[] d) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int dCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] d = new long[dCount];

        String[] dItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < dCount; i  ) {
            long dItem = Long.parseLong(dItems[i]);
            d[i] = dItem;
        }

        int components = findConnectedComponents(d);

        bufferedWriter.write(String.valueOf(components));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
