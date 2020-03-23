import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'changeBits' function below.
     *
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     *  3. STRING_ARRAY queries
     */

    public static void changeBits(String a, String b, List<String> queries) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s $", "").split(" ");

        int ab_size = Integer.parseInt(firstMultipleInput[0]);

        int queries_size = Integer.parseInt(firstMultipleInput[1]);

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < queries_size; i  ) {
            String queriesItem = bufferedReader.readLine();
            queries.add(queriesItem);
        }

        Result.changeBits(a, b, queries);

        bufferedReader.close();
    }
}
