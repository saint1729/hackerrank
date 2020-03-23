import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the storyOfATree function below.
     */
    static String storyOfATree(int n, int[][] edges, int k, int[][] guesses) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr  ) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int[][] edges = new int[n-1][2];

            for (int edgesRowItr = 0; edgesRowItr < n-1; edgesRowItr  ) {
                String[] edgesRowItems = scanner.nextLine().split(" ");

                for (int edgesColumnItr = 0; edgesColumnItr < 2; edgesColumnItr  ) {
                    int edgesItem = Integer.parseInt(edgesRowItems[edgesColumnItr].trim());
                    edges[edgesRowItr][edgesColumnItr] = edgesItem;
                }
            }

            String[] gk = scanner.nextLine().split(" ");

            int g = Integer.parseInt(gk[0].trim());

            int k = Integer.parseInt(gk[1].trim());

            int[][] guesses = new int[q][2];

            for (int guessesRowItr = 0; guessesRowItr < q; guessesRowItr  ) {
                String[] guessesRowItems = scanner.nextLine().split(" ");

                for (int guessesColumnItr = 0; guessesColumnItr < 2; guessesColumnItr  ) {
                    int guessesItem = Integer.parseInt(guessesRowItems[guessesColumnItr].trim());
                    guesses[guessesRowItr][guessesColumnItr] = guessesItem;
                }
            }

            String result = storyOfATree(n, edges, k, guesses);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
