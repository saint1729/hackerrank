import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'quadrants' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY p
     *  2. STRING_ARRAY queries
     */

    public static void quadrants(List<List<Integer>> p, List<String> queries) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> p = new ArrayList<>();

        for (int i = 0; i < n; i  ) {
            String[] pRowTempItems = bufferedReader.readLine().replaceAll("\\s $", "").split(" ");

            List<Integer> pRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j  ) {
                int pItem = Integer.parseInt(pRowTempItems[j]);
                pRowItems.add(pItem);
            }

            p.add(pRowItems);
        }

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < q; i  ) {
            String queriesItem = bufferedReader.readLine();
            queries.add(queriesItem);
        }

        Result.quadrants(p, queries);

        bufferedReader.close();
    }
}
