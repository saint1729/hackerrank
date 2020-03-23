import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the xorMatrix function below.
     */
    static int[] xorMatrix(int m, int[] first_row) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] first_row = new int[n];

        String[] first_rowItems = scanner.nextLine().split(" ");

        for (int first_rowItr = 0; first_rowItr < n; first_rowItr  ) {
            int first_rowItem = Integer.parseInt(first_rowItems[first_rowItr].trim());
            first_row[first_rowItr] = first_rowItem;
        }

        int[] last_row = xorMatrix(m, first_row);

        for (int resultItr = 0; resultItr < result.length; resultItr  ) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
