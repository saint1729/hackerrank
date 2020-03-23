import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the hackerrankCity function below.
     */
    static int hackerrankCity(int[] A) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int ACount = Integer.parseInt(scanner.nextLine().trim());

        int[] A = new int[ACount];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < ACount; AItr  ) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = hackerrankCity(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
