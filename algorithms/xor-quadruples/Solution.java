import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the beautifulQuadruples function below.
     */
    static int beautifulQuadruples(int a, int b, int c, int d) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] abcd = scanner.nextLine().split(" ");

        int a = Integer.parseInt(abcd[0].trim());

        int b = Integer.parseInt(abcd[1].trim());

        int c = Integer.parseInt(abcd[2].trim());

        int d = Integer.parseInt(abcd[3].trim());

        int result = beautifulQuadruples(a, b, c, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
