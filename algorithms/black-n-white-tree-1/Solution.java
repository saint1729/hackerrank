import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the blackWhiteTree function below.
     */

    /*
     * For the unweighted graph, <name>:
     *
     * 1. The number of nodes is <name>Nodes.
     * 2. The number of edges is <name>Edges.
     * 3. An edge exists between <name>From[i] to <name>To[i].
     *
     */
    static int[] blackWhiteTree(int gNodes, int[] gFrom, int[] gTo) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] gNodesEdges = scanner.nextLine().split(" ");
        int gNodes = Integer.parseInt(gNodesEdges[0].trim());
        int gEdges = Integer.parseInt(gNodesEdges[1].trim());

        int[] gFrom = new int[gEdges];
        int[] gTo = new int[gEdges];

        for (int gItr = 0; gItr < gEdges; gItr  ) {
            String[] gFromTo = scanner.nextLine().split(" ");
            gFrom[gItr] = Integer.parseInt(gFromTo[0].trim());
            gTo[gItr] = Integer.parseInt(gFromTo[1].trim());
        }

        int[] result = blackWhiteTree(gNodes, gFrom, gTo);

        for (int resultItr = 0; resultItr < result.length; resultItr  ) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
