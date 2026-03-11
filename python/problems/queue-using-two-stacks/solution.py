"""
You must first implement a Queue using two stacks. Then process  queries, where each query is one of the following  types:

1 x: Enqueue element  into the end of the queue.
2: Dequeue the element at the front of the queue.
3: Print the element at the front of the queue.
"""

class CustomQueue:
    def __init__(self):
        self.in_stack = []
        self.out_stack = []
    
    def enqueue(self, x):
        self.in_stack.append(x)
    
    def dequeue(self):
        if not self.out_stack:
            while self.in_stack:
                self.out_stack.append(self.in_stack.pop())
        return self.out_stack.pop() if self.out_stack else None
    
    def peek(self):
        if not self.out_stack:
            while self.in_stack:
                self.out_stack.append(self.in_stack.pop())
        return self.out_stack[-1] if self.out_stack else None


if __name__ == '__main__':
    q = CustomQueue()
    n = int(input().strip())
    for _ in range(n):
        query = list(map(int, input().strip().split()))
        if query[0] == 1:
            q.enqueue(query[1])
        elif query[0] == 2:
            q.dequeue()
        elif query[0] == 3:
            print(q.peek())
