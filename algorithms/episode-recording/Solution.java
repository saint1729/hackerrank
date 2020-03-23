import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the episodeRecording function below.
     */
    static int[] episodeRecording(int[][] episodes) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int qItr = 0; qItr < q; qItr  ) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int[][] episodes = new int[n][4];

            for (int episodesRowItr = 0; episodesRowItr < n; episodesRowItr  ) {
                String[] episodesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

                for (int episodesColumnItr = 0; episodesColumnItr < 4; episodesColumnItr  ) {
                    int episodesItem = Integer.parseInt(episodesRowItems[episodesColumnItr]);
                    episodes[episodesRowItr][episodesColumnItr] = episodesItem;
                }
            }

            int[] result = episodeRecording(episodes);

            for (int resultItr = 0; resultItr < result.length; resultItr  ) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
