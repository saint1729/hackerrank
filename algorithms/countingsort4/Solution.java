import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSort function below.
    static void countSort(List<List<String>> arr) {


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i  ) {
            arr.add(Arrays.asList(bufferedReader.readLine().replaceAll("\\s $", "").split(" ")));
        }

        countSort(arr);

        bufferedReader.close();
    }
}
