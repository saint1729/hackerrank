import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the roadNetwork function below.
     */

    /*
     * For the weighted graph, <name>:
     *
     * 1. The number of nodes is <name>Nodes.
     * 2. The number of edges is <name>Edges.
     * 3. An edge exists between <name>From[i] to <name>To[i] and the weight of the edge is <name>Weight[i].
     *
     */
    static int roadNetwork(int roadNodes, int[] roadFrom, int[] roadTo, int[] roadWeight) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] roadNodesEdges = scanner.nextLine().split(" ");
        int roadNodes = Integer.parseInt(roadNodesEdges[0].trim());
        int roadEdges = Integer.parseInt(roadNodesEdges[1].trim());

        int[] roadFrom = new int[roadEdges];
        int[] roadTo = new int[roadEdges];
        int[] roadWeight = new int[roadEdges];

        for (int roadItr = 0; roadItr < roadEdges; roadItr  ) {
            String[] roadFromToWeight = scanner.nextLine().split(" ");
            roadFrom[roadItr] = Integer.parseInt(roadFromToWeight[0].trim());
            roadTo[roadItr] = Integer.parseInt(roadFromToWeight[1].trim());
            roadWeight[roadItr] = Integer.parseInt(roadFromToWeight[2].trim());
        }

        int result = roadNetwork(roadNodes, roadFrom, roadTo, roadWeight);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
