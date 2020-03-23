import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the valueOfFriendsship function below.
     */
    static int valueOfFriendsship(int n, int[][] friendships) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr  ) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0].trim());

            int m = Integer.parseInt(nm[1].trim());

            int[][] friendships = new int[m][2];

            for (int friendshipsRowItr = 0; friendshipsRowItr < m; friendshipsRowItr  ) {
                String[] friendshipsRowItems = scanner.nextLine().split(" ");

                for (int friendshipsColumnItr = 0; friendshipsColumnItr < 2; friendshipsColumnItr  ) {
                    int friendshipsItem = Integer.parseInt(friendshipsRowItems[friendshipsColumnItr].trim());
                    friendships[friendshipsRowItr][friendshipsColumnItr] = friendshipsItem;
                }
            }

            int result = valueOfFriendsship(n, friendships);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
