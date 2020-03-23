import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the indianJob function below.
     */
    static String indianJob(int g, int[] arr) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            String[] ng = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ng[0].trim());

            int g = Integer.parseInt(ng[1].trim());

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");

            for (int arrItr = 0; arrItr < n; arrItr  ) {
                int arrItem = Integer.parseInt(arrItems[arrItr].trim());
                arr[arrItr] = arrItem;
            }

            String indianJob = g(arr);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
