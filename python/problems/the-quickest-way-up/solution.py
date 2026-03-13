#!/bin/python3

import heapq
import math
import os
import random
import re
import sys
from collections import deque


#
# Complete the 'quickestWayUp' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. 2D_INTEGER_ARRAY ladders
#  2. 2D_INTEGER_ARRAY snakes
#

def quickestWayUp(ladders, snakes):
    # Build adjacency list for the board graph
    # From each position, you can roll 1-6 and reach that position
    # If that position has a ladder or snake, you follow it
    
    graph = {i: [] for i in range(1, 101)}
    
    # Create mapping for ladders and snakes
    transitions = {}
    for start, end in ladders + snakes:
        transitions[start] = end
    
    # Build graph edges
    for pos in range(1, 101):
        # Roll die: can move 1-6 steps forward
        for dice in range(1, 7):
            next_pos = pos + dice
            if next_pos <= 100:
                # Apply ladder or snake if present on next_pos
                final_pos = transitions.get(next_pos, next_pos)
                graph[pos].append(final_pos)
    
    # Dijkstra's algorithm
    dist = {i: float('inf') for i in range(1, 101)}
    dist[1] = 0
    pq = [(0, 1)]  # (distance, position)
    
    while pq:
        d, node = heapq.heappop(pq)
        
        # Skip if we've already found a shorter path
        if d > dist[node]:
            continue
        
        # Explore neighbors
        for neighbor in graph[node]:
            if dist[neighbor] > dist[node] + 1:
                dist[neighbor] = dist[node] + 1
                heapq.heappush(pq, (dist[neighbor], neighbor))
    
    return dist[100] if dist[100] != float('inf') else -1


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input().strip())

    for t_itr in range(t):
        n = int(input().strip())

        ladders = []

        for _ in range(n):
            ladders.append(list(map(int, input().rstrip().split())))

        m = int(input().strip())

        snakes = []

        for _ in range(m):
            snakes.append(list(map(int, input().rstrip().split())))

        result = quickestWayUp(ladders, snakes)

        fptr.write(str(result) + '\n')

    fptr.close()
