import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the componentsInGraph function below.
     */
    static int[] componentsInGraph(int[][] gb) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        int[][] gb = new int[n][2];

        for (int gbRowItr = 0; gbRowItr < n; gbRowItr  ) {
            String[] gbRowItems = scanner.nextLine().split(" ");

            for (int gbColumnItr = 0; gbColumnItr < 2; gbColumnItr  ) {
                int gbItem = Integer.parseInt(gbRowItems[gbColumnItr].trim());
                gb[gbRowItr][gbColumnItr] = gbItem;
            }
        }

        int[] result = componentsInGraph(gb);

        for (int SPACEItr = 0; SPACEItr < SPACE.length; SPACEItr  ) {
            bufferedWriter.write(String.valueOf(SPACE[SPACEItr]));

            if (SPACEItr != SPACE.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
