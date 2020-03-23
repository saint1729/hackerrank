import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] roadNodesEdges = scanner.nextLine().split(" ");
        int roadNodes = Integer.parseInt(roadNodesEdges[0].trim());
        int roadEdges = Integer.parseInt(roadNodesEdges[1].trim());

        int[] roadFrom = new int[roadEdges];
        int[] roadTo = new int[roadEdges];
        int[] roadWeight = new int[roadEdges];

        for (int i = 0; i < roadEdges; i  ) {
            String[] roadFromToWeight = scanner.nextLine().split(" ");
            roadFrom[i] = Integer.parseInt(roadFromToWeight[0].trim());
            roadTo[i] = Integer.parseInt(roadFromToWeight[1].trim());
            roadWeight[i] = Integer.parseInt(roadFromToWeight[2].trim());
        }

        scanner.close();
    }
}
