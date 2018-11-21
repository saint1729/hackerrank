/*


https://www.hackerrank.com/challenges/angry-children/problem



Max Min
Problem
Submissions
Leaderboard
Discussions
Editorial
Topics
You will be given a list of integers, , and a single integer . You must create an array of length  from elements of  such that its unfairness is minimized. Call that array . Unfairness of an array is calculated as

Where: 
- max denotes the largest integer in  
- min denotes the smallest integer in 

As an example, consider the array  with a  of . Pick any two elements, test . 
 
Testing for all pairs, the solution  provides the minimum unfairness.

Note: Integers in  may not be unique.

Function Description

Complete the maxMin function in the editor below. It must return an integer that denotes the minimum possible value of unfairness.

maxMin has the following parameter(s):

k: an integer, the number of elements in the array to create
arr: an array of integers .
Input Format

The first line contains an integer , the number of elements in array . 
The second line contains an integer . 
Each of the next  lines contains an integer  where .

Constraints

 
 

Output Format

An integer that denotes the minimum possible value of unfairness.

Sample Input 0

7
3
10
100
300
200
1000
20
30
Sample Output 0

20
Explanation 0

Here ; selecting the  integers , unfairness equals

max(10,20,30) - min(10,20,30) = 30 - 10 = 20
Sample Input 1

10
4
1
2
3
4
10
20
30
40
100
200
Sample Output 1

3
Explanation 1

Here ; selecting the  integers , unfairness equals

max(1,2,3,4) - min(1,2,3,4) = 4 - 1 = 3
Sample Input 2

5
2
1
2
1
2
1
Sample Output 2

0
Explanation 2

Here .  or  give the minimum unfairness of .



*/





import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {

        Arrays.sort(arr);
        
        int ans = Integer.MAX_VALUE; // arr[arr.length-1]-arr[0];
        
        for(int i = 0; i < arr.length-k+1; i++) {
            ans = Math.min(ans, arr[i+k-1]-arr[i]);
        }
        
        return ans;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        int result = maxMin(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
