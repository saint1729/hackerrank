import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the separateTheChocolate function below.
     */
    static int separateTheChocolate(String[] chocolate) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] mnk = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mnk[0].trim());

        int n = Integer.parseInt(mnk[1].trim());

        int k = Integer.parseInt(mnk[2].trim());

        String[] chocolate = new String[m];

        for (int chocolateItr = 0; chocolateItr < m; chocolateItr  ) {
            String chocolateItem = scanner.nextLine();
            chocolate[chocolateItr] = chocolateItem;
        }

        int result = separateTheChocolate(chocolate);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
