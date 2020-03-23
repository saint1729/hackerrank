import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the decentNumber function below.
    static void decentNumber(int n) {


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr  ) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            decentNumber(n);
        }

        bufferedReader.close();
    }
}
