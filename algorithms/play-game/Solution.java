import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the bricksGame function below.
     */
    static int bricksGame(int[] arr) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            int arrCount = Integer.parseInt(scanner.nextLine().trim());

            int[] arr = new int[arrCount];

            String[] arrItems = scanner.nextLine().split(" ");

            for (int arrItr = 0; arrItr < arrCount; arrItr  ) {
                int arrItem = Integer.parseInt(arrItems[arrItr].trim());
                arr[arrItr] = arrItem;
            }

            int result = bricksGame(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
