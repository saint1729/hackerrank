/*



https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem



Hash Tables: Ice Cream Parlor
Problem
Submissions
Leaderboard
Discussions
Editorial
Check out the resources on the page's right side to learn more about binary search. The video tutorial is by Gayle Laakmann McDowell, author of the best-selling interview book Cracking the Coding Interview.

Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool their money to buy ice cream. On any given day, the parlor offers a line of flavors. Each flavor has a cost associated with it.

Given the value of  and the  of each flavor for  trips to the Ice Cream Parlor, help Sunny and Johnny choose two distinct flavors such that they spend their entire pool of money during each visit. ID numbers are the 1- based index number associated with a . For each trip to the parlor, print the ID numbers for the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line. You must print the smaller ID first and the larger ID second.

For example, there are  flavors having . Together they have  to spend. They would purchase flavor ID's  and  for a cost of . Use  based indexing for your response.

Note:

Two ice creams having unique IDs  and  may have the same cost (i.e., ).
There will always be a unique solution.
Function Description

Complete the function whatFlavors in the editor below. It must determine the two flavors they will purchase and print them as two space-separated integers on a line.

whatFlavors has the following parameter(s):

cost: an array of integers representing price for a flavor
money: an integer representing the amount of money they have to spend
Input Format

The first line contains an integer, , the number of trips to the ice cream parlor.

Each of the next  sets of  lines is as follows:

The first line contains .
The second line contains an integer, , the size of the array .
The third line contains  space-separated integers denoting the .
Constraints

Output Format

Print two space-separated integers denoting the respective indices for the two distinct flavors they choose to purchase in ascending order. Recall that each ice cream flavor has a unique ID number in the inclusive range from  to .

Sample Input

2
4
5
1 4 5 3 2
4
4
2 2 4 3
Sample Output

1 4
1 2
Explanation

Sunny and Johnny make the following two trips to the parlor:

The first time, they pool together  dollars. There are five flavors available that day and flavors  and  have a total cost of .
The second time, they pool together  dollars. There are four flavors available that day and flavors  and  have a total cost of .



*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {

        int x = 0, y = 0;
        
        Map<Integer, ArrayList<Integer>> m = new HashMap<>();
        
        for(int i = 0; i < cost.length; i++) {
            ArrayList<Integer> l = m.getOrDefault(cost[i], new ArrayList<Integer>());
            l.add(i+1);
            m.put(cost[i], l);
        }
        
        for(int i = 0; i < cost.length; i++) {
            int a = cost[i];
            int b = money-cost[i];
            if(a != b) {
                ArrayList<Integer> l = m.get(b);
                if(l != null) {
                    System.out.println((i+1) + " " + l.get(0));
                    return;
                }
            } else if(a == b) {
                ArrayList<Integer> l = m.get(a);
                if(l.size() > 1) {
                    System.out.println(l.get(0) + " " + l.get(1));
                    return;
                }
            }
        }
        
        return;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}

