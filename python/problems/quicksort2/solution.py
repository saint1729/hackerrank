"""
Guideline
In Insertion Sort, you simply went through each element in order and inserted it into a sorted sub-array. In this challenge, you cannot focus on one element at a time, but instead must deal with whole sub-arrays, with a strategy known as "divide and conquer".

When partition is called on an array, two parts of the array get 'sorted' with respect to each other. If partition is then called on each sub-array, the array will now be split into four parts. This process can be repeated until the sub-arrays are small. Notice that when partition is called on just one of the numbers, they end up being sorted.

Can you repeatedly call partition so that the entire array ends up sorted?

Print Sub-Arrays
In this challenge, print your array every time your partitioning method finishes, i.e. whenever two subarrays, along with the pivot, are merged together.

The first element in a sub-array should be used as a pivot.
Partition the left side before partitioning the right side.
The pivot should be placed between sub-arrays while merging them.
Array of length 1 or less will be considered sorted, and there is no need to sort or to print them.
Note
Please maintain the original order of the elements in the left and right partitions while partitioning around a pivot element.

For example: Partition about the first element for the array A[]={5, 8, 1, 3, 7, 9, 2} will be {1, 3, 2, 5, 8, 7, 9}

Input Format
There will be two lines of input:

 - the size of the array
 - the n numbers of the array
Output Format
Print every partitioned sub-array on a new line.
"""


def quickSort(arr):
    if len(arr) <= 1:
        return arr

    pivot = arr[0]
    left = [value for value in arr[1:] if value < pivot]
    right = [value for value in arr[1:] if value >= pivot]

    sorted_left = quickSort(left)
    sorted_right = quickSort(right)
    result = sorted_left + [pivot] + sorted_right

    print(' '.join(map(str, result)))
    return result


if __name__ == '__main__':
    n = int(input().strip())
    arr = list(map(int, input().rstrip().split()))
    quickSort(arr)
