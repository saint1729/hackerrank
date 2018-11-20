/*



https://www.hackerrank.com/challenges/luck-balance/problem


Luck Balance
Problem
Submissions
Leaderboard
Discussions
Editorial
Lena is preparing for an important coding competition that is preceded by a number of sequential preliminary contests. She believes in "saving luck", and wants to check her theory. Each contest is described by two integers,  and :

 is the amount of luck associated with a contest. If Lena wins the contest, her luck balance will decrease by ; if she loses it, her luck balance will increase by .
 denotes the contest's importance rating. It's equal to  if the contest is important, and it's equal to  if it's unimportant.
If Lena loses no more than  important contests, what is the maximum amount of luck she can have after competing in all the preliminary contests? This value may be negative.

For example,  and:

Contest		L[i]	T[i]
1		5	1
2		1	1
3		4	0
If Lena loses all of the contests, her will be . Since she is allowed to lose  important contests, and there are only  important contests. She can lose all three contests to maximize her luck at . If , she has to win at least  of the important contests. She would choose to win the lowest value important contest worth . Her final luck will be .

Function Description

Complete the luckBalance function in the editor below. It should return an integer that represents the maximum luck balance achievable.

luckBalance has the following parameter(s):

k: the number of important contests Lena can lose
contests: a 2D array of integers where each  contains two integers that represent the luck balance and importance of the  contest.
Input Format

The first line contains two space-separated integers  and , the number of preliminary contests and the maximum number of important contests Lena can lose. 
Each of the next  lines contains two space-separated integers,  and , the contest's luck balance and its importance rating.

Constraints

Output Format

Print a single integer denoting the maximum amount of luck Lena can have after all the contests.

Sample Input

6 3
5 1
2 1
1 1
8 1
10 0
5 0
Sample Output

29
Explanation

There are  contests. Of these contests,  are important and she cannot lose more than  of them. Lena maximizes her luck if she wins the  important contest (where ) and loses all of the other five contests for a total luck balance of .





*/





import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {

        Arrays.sort(contests, new Comparator<int[]>() {
            public int compare(final int[] a, final int[] b) {
                return b[0]-a[0];
            }
        });
        
        Arrays.sort(contests, new Comparator<int[]>() {
            public int compare(final int[] a, final int[] b) {
                return b[1]-a[1];
            }
        });
        
        int ans = 0, i = 0;
        
        for(; i < k; i++) {
            ans += contests[i][0];
        }
        
        for(; (i < contests.length) && (contests[i][1] == 1); i++) {
            ans -= contests[i][0];
        }
        
        for(; i < contests.length; i++) {
            ans += contests[i][0];
        }        
        
        return ans;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
