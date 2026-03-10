"""
This question is designed to help you get a better understanding of basic heap operations.

There are  types of query:

" " - Add an element  to the heap.
" " - Delete the element  from the heap.
"" - Print the minimum of all the elements in the heap.
NOTE: It is guaranteed that the element to be deleted will be there in the heap. Also, at any instant, only distinct elements will be in the heap.

Input Format

The first line contains the number of queries, .
Each of the next  lines contains one of the  types of query.

Constraints


Output Format

For each query of type , print the minimum value on a single line.

Sample Input

STDIN       Function
-----       --------
5           Q = 5
1 4         insert 4
1 9         insert 9
3           print minimum
2 4         delete 4
3           print minimum
Sample Output

4  
9 
Explanation

After the first  queries, the heap contains {}. Printing the minimum gives  as the output. Then, the  query deletes  from the heap, and the  query gives  as the output.
"""

# implement heap from scratch

class MinHeap:
    def __init__(self):
        self.heap = []
    
    def insert(self, value):
        self.heap.append(value)
        self._heapify_up(len(self.heap) - 1)
    
    def _heapify_up(self, index):
        # iteratively heapify up
        while index > 0:
            parent = (index - 1) // 2
            if self.heap[index] < self.heap[parent]:
                self.heap[index], self.heap[parent] = self.heap[parent], self.heap[index]
                index = parent
            else:
                break
    
    def delete(self, value):
        try:
            index = self.heap.index(value)
            last_value = self.heap.pop()  # remove last element
            if index < len(self.heap):
                self.heap[index] = last_value
                self._heapify_down(index)
        except ValueError:
            return  # value not found, do nothing
    
    def _heapify_down(self, index):
        # iterative implementation of heapify down
        size = len(self.heap)
        while True:
            smallest = index
            left = 2 * index + 1
            right = 2 * index + 2

            if left < size and self.heap[left] < self.heap[smallest]:
                smallest = left
            if right < size and self.heap[right] < self.heap[smallest]:
                smallest = right
            if smallest != index:
                self.heap[index], self.heap[smallest] = self.heap[smallest], self.heap[index]
                index = smallest
            else:
                break
    
    def get_min(self):
        return self.heap[0] if self.heap else None


if __name__ == "__main__":
    heap = MinHeap()
    q = int(input().strip())
    for _ in range(q):
        query = list(map(int, input().rstrip().split()))
        if query[0] == 1:
            heap.insert(query[1])
        elif query[0] == 2:
            heap.delete(query[1])
        elif query[0] == 3:
            print(heap.get_min())
