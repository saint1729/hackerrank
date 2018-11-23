/*



https://www.hackerrank.com/challenges/abbr/problem




Abbreviation
Problem
Submissions
Leaderboard
Discussions
Editorial
You can perform the following operations on the string, :

Capitalize zero or more of 's lowercase letters.
Delete all of the remaining lowercase letters in .
Given two strings,  and , determine if it's possible to make  equal to  as described. If so, print YES on a new line. Otherwise, print NO.

For example, given  and , in  we can convert  and delete  to match . If  and , matching is not possible because letters may only be capitalized or discarded, not changed.

Function Description

Complete the function  in the editor below. It must return either  or .

abbreviation has the following parameter(s):

a: the string to modify
b: the string to match
Input Format

The first line contains a single integer , the number of queries.

Each of the next  pairs of lines is as follows: 
- The first line of each query contains a single string, . 
- The second line of each query contains a single string, .

Constraints

String  consists only of uppercase and lowercase English letters, ascii[A-Za-z].
String  consists only of uppercase English letters, ascii[A-Z].
Output Format

For each query, print YES on a new line if it's possible to make string  equal to string . Otherwise, print NO.

Sample Input

1
daBcd
ABC
Sample Output

YES
Explanation

image

We have  daBcd and  ABC. We perform the following operation:

Capitalize the letters a and c in  so that  dABCd.
Delete all the remaining lowercase letters in  so that  ABC.
Because we were able to successfully convert  to , we print YES on a new line.




*/





import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static boolean isValidSubsequence(String x, String y) {
        
        char[] a = x.toCharArray();
        char[] b = y.toCharArray();
        
        int m = a.length, n = b.length;
        
        boolean[][] isValid = new boolean[m+1][n+1];
        
        isValid[0][0] = true;
        
        boolean isCapital = false;
        for(int i = 1; i <= m; i++) {
            if(Character.isUpperCase(a[i-1]) || isCapital) {
                isCapital = true;
                isValid[i][0] = false;
            } else {
                isValid[i][0] = true;
            }
        }
        
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(a[i-1] == b[j-1]) {
                    isValid[i][j] = isValid[i-1][j-1];
                } else if(a[i-1]-32 == b[j-1]) {
                    isValid[i][j] = isValid[i-1][j-1] || isValid[i-1][j];
                } else if(Character.isUpperCase(a[i-1])) {
                    isValid[i][j] = false;
                } else {
                    isValid[i][j] = isValid[i-1][j];
                }
            }
        }
        
        return isValid[m][n];
        
    }
    
    // Complete the abbreviation function below.
    static String abbreviation(String a, String b) {

        return (isValidSubsequence(a, b)) ? "YES" : "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
