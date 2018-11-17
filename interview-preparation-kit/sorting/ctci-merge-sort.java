/*


https://www.hackerrank.com/challenges/ctci-merge-sort/problem


Merge Sort: Counting Inversions
Problem
Submissions
Leaderboard
Discussions
Editorial
Check out the resources on the page's right side to learn more about merge sort. The video tutorial is by Gayle Laakmann McDowell, author of the best-selling interview book Cracking the Coding Interview.

In an array, , the elements at indices  and  (where ) form an inversion if . In other words, inverted elements  and  are considered to be "out of order". To correct an inversion, we can swap adjacent elements.

For example, consider the dataset . It has two inversions:  and . To sort the array, we must perform the following two swaps to correct the inversions:

Given  datasets, print the number of inversions that must be swapped to sort each dataset on a new line.

Function Description

Complete the function countInversions in the editor below. It must return an integer representing the number of inversions required to sort the array.

countInversions has the following parameter(s):

arr: an array of integers to sort .
Input Format

The first line contains an integer, , the number of datasets.

Each of the next  pairs of lines is as follows:

The first line contains an integer, , the number of elements in .
The second line contains  space-separated integers, .
Constraints

Output Format

For each of the  datasets, return the number of inversions that must be swapped to sort the dataset.

Sample Input

2  
5  
1 1 1 2 2  
5  
2 1 3 1 2
Sample Output

0  
4   
Explanation

We sort the following  datasets:

 is already sorted, so there are no inversions for us to correct. Thus, we print  on a new line.
We performed a total of  swaps to correct inversions.



*/





import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static long merge(int[] arr, int[] left, int[] right) {
        
        int i = 0, j = 0;
        long ans = 0;
        while((i < left.length) || (j < right.length)) {
            if(i == left.length) {
                arr[i+j] = right[j++];
            } else if(j == right.length) {
                arr[i+j] = left[i++];
            } else if(left[i] <= right[j]) {
                arr[i+j] = left[i++];
            } else {
                arr[i+j] = right[j++];
                ans += (left.length-i);
            }
        }
        
        return ans;
    }
    
    // Complete the countInversions function below.
    static long countInversions(int[] arr) {

        if(arr.length < 2) {
            return 0;
        }
        
        int mid = (arr.length+1)/2;
        
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        
        return countInversions(left)+countInversions(right)+merge(arr, left, right);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            long result = countInversions(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
