import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the realEstateBroker function below.
     */
    static int realEstateBroker(int[][] clients, int[][] houses) {
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

        int[][] clients = new int[n][2];

        for (int clientsRowItr = 0; clientsRowItr < n; clientsRowItr  ) {
            String[] clientsRowItems = scanner.nextLine().split(" ");

            for (int clientsColumnItr = 0; clientsColumnItr < 2; clientsColumnItr  ) {
                int clientsItem = Integer.parseInt(clientsRowItems[clientsColumnItr].trim());
                clients[clientsRowItr][clientsColumnItr] = clientsItem;
            }
        }

        int[][] houses = new int[m][2];

        for (int housesRowItr = 0; housesRowItr < m; housesRowItr  ) {
            String[] housesRowItems = scanner.nextLine().split(" ");

            for (int housesColumnItr = 0; housesColumnItr < 2; housesColumnItr  ) {
                int housesItem = Integer.parseInt(housesRowItems[housesColumnItr].trim());
                houses[housesRowItr][housesColumnItr] = housesItem;
            }
        }

        int result = realEstateBroker(clents, houses);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
