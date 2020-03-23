import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the kingRichardKnights function below.
     */
    static int[][] kingRichardKnights(int n, int s, int[] knights) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int[][] commands = new int[s][3];

        for (int commandsRowItr = 0; commandsRowItr < s; commandsRowItr  ) {
            String[] commandsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int commandsColumnItr = 0; commandsColumnItr < 3; commandsColumnItr  ) {
                int commandsItem = Integer.parseInt(commandsRowItems[commandsColumnItr]);
                commands[commandsRowItr][commandsColumnItr] = commandsItem;
            }
        }

        int[][] result = kingRichardKnights(n, s, knights);

        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr  ) {
            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr  ) {
                bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));

                if (resultColumnItr != result[resultRowItr].length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            if (resultRowItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
