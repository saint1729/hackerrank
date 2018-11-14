/*



https://www.hackerrank.com/challenges/count-triplets-1/problem



Count Triplets
Problem
Submissions
Leaderboard
Discussions
Editorial
You are given an array and you need to find number of tripets of indices  such that the elements at those indices are in geometric progression for a given common ratio  and .

For example, . If , we have  and  at indices  and .

Function Description

Complete the countTriplets function in the editor below. It should return the number of triplets forming a geometric progression for a given  as an integer.

countTriplets has the following parameter(s):

arr: an array of integers
r: an integer, the common ratio
Input Format

The first line contains two space-separated integers  and , the size of  and the common ratio. 
The next line contains  space-seperated integers .

Constraints

Output Format

Return the count of triplets that form a geometric progression.

Sample Input 0

4 2
1 2 2 4
Sample Output 0

2
Explanation 0

There are  triplets in satisfying our criteria, whose indices are  and 

Sample Input 1

6 3
1 3 9 9 27 81
Sample Output 1

6
Explanation 1

The triplets satisfying are index , , , ,  and .

Sample Input 2

5 5
1 5 5 25 125
Sample Output 2

4
Explanation 2

The triplets satisfying are index , , , .




*/





import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {

        long ans = 0;
        
        Map<Long, Long> m1 = new HashMap<>();
        Map<Long, Long> m2 = new HashMap<>();
        
        for(int k = 2; k < arr.size(); k++) {
            m2.put(arr.get(k), m2.getOrDefault(arr.get(k), 0L)+1);
        }
        // System.out.println(m2.get(9L) +"9 val");
        
        m1.put(arr.get(0), 1L);
        
        for(int j = 1; j < arr.size()-1; j++) {
            long a = arr.get(j);
            long abr = (a%r == 0L) ? (a/r) : 0L;
            long ar = a*r;
            if(m1.containsKey(abr) && m2.containsKey(ar)) {
                ans += (m1.get(abr)*m2.get(ar));
                // System.out.println(ans +"  "+m2.get(ar)+ "  "+ ar);
            }
            m1.put(a, m1.getOrDefault(a, 0L)+1);
            m2.put(arr.get(j+1), m2.get(arr.get(j+1))-1);
        }
        
        
        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
