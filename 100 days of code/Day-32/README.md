# 📊 Day 32 - Median of Two Sorted Arrays

Solved the **Median of Two Sorted Arrays** problem using the **Binary Search on Partition** approach to efficiently find the median of two sorted arrays without merging them.

## Approach

* Always perform binary search on the smaller array to reduce the search space.
* Partition both arrays such that:
  * The left partitions together contain half of the total elements.
  * Every element in the left partitions is less than or equal to every element in the right partitions.
* At each binary search step:
  * Calculate the partition indices for both arrays.
  * Compare the boundary elements around the partitions.
  * If the partition is valid:
    * If the total number of elements is even, return the average of the two middle elements.
    * Otherwise, return the maximum element from the left partitions.
  * If the partition is invalid:
    * Move the binary search left or right based on the comparison of partition boundary elements.
* Continue until the correct partition is found.

## Complexity

* **Time:** O(log(min(m, n)))
* **Space:** O(1)

Where:

* `m` = size of the first sorted array.
* `n` = size of the second sorted array.
* Binary search is performed only on the smaller array.

## What I Learned

* Applying **Binary Search** on array partitions instead of searching element values.
* Finding the median without merging two sorted arrays.
* Handling boundary conditions efficiently using `Integer.MIN_VALUE` and `Integer.MAX_VALUE`.
* Understanding how valid partitions guarantee the correct median.
* Achieving the required **O(log(min(m, n)))** time complexity with constant extra space.

✅ **Day 32 Complete**
