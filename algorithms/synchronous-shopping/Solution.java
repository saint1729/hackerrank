import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'shop' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. STRING_ARRAY centers
     *  4. 2D_INTEGER_ARRAY roads
     */

    public static int shop(int n, int k, List<String> centers, List<List<Integer>> roads) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s $", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        List<String> centers = new ArrayList<>();

        for (int i = 0; i < n; i  ) {
            String centersItem = bufferedReader.readLine();
            centers.add(centersItem);
        }

        List<List<Integer>> roads = new ArrayList<>();

        for (int i = 0; i < m; i  ) {
            String[] roadsRowTempItems = bufferedReader.readLine().replaceAll("\\s $", "").split(" ");

            List<Integer> roadsRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j  ) {
                int roadsItem = Integer.parseInt(roadsRowTempItems[j]);
                roadsRowItems.add(roadsItem);
            }

            roads.add(roadsRowItems);
        }

        int res = Result.shop(n, k, centers, roads);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
