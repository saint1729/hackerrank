import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the acessoryCollection function below.
     */
    static String acessoryCollection(int L, int A, int N, int D) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(scanner.nextLine().trim());

        for (int TItr = 0; TItr < T; TItr  ) {
            String[] LAND = scanner.nextLine().split(" ");

            int L = Integer.parseInt(LAND[0].trim());

            int A = Integer.parseInt(LAND[1].trim());

            int N = Integer.parseInt(LAND[2].trim());

            int D = Integer.parseInt(LAND[3].trim());

            String result = acessoryCollection(L, A, N, D);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
