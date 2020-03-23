import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the alexFedor function below.
     */

    /*
     * For the weighted graph, <name>:
     *
     * 1. The number of nodes is <name>Nodes.
     * 2. The number of edges is <name>Edges.
     * 3. An edge exists between <name>From[i] to <name>To[i] and the weight of the edge is <name>Weight[i].
     *
     */
    static String alexFedor(int graphNodes, int[] graphFrom, int[] graphTo, int[] graphWeight) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] graphNodesEdges = scanner.nextLine().split(" ");
        int graphNodes = Integer.parseInt(graphNodesEdges[0].trim());
        int graphEdges = Integer.parseInt(graphNodesEdges[1].trim());

        int[] graphFrom = new int[graphEdges];
        int[] graphTo = new int[graphEdges];
        int[] graphWeight = new int[graphEdges];

        for (int graphItr = 0; graphItr < graphEdges; graphItr  ) {
            String[] graphFromToWeight = scanner.nextLine().split(" ");
            graphFrom[graphItr] = Integer.parseInt(graphFromToWeight[0].trim());
            graphTo[graphItr] = Integer.parseInt(graphFromToWeight[1].trim());
            graphWeight[graphItr] = Integer.parseInt(graphFromToWeight[2].trim());
        }

        String result = alexFedor(graphNodes, graphFrom, graphTo, graphWeight);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
