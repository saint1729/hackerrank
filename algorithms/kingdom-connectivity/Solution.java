import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'countPaths' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY edges
     */

    public static void countPaths(int n, List<List<Integer>> edges) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s $", "").split(" ");

        int nodes = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> edges = new ArrayList<>();

        for (int i = 0; i < m; i  ) {
            String[] edgesRowTempItems = bufferedReader.readLine().replaceAll("\\s $", "").split(" ");

            List<Integer> edgesRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j  ) {
                int edgesItem = Integer.parseInt(edgesRowTempItems[j]);
                edgesRowItems.add(edgesItem);
            }

            edges.add(edgesRowItems);
        }

        Result.countPaths(nodes, edges);

        bufferedReader.close();
    }
}
