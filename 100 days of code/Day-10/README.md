# Day 10 - Maximum Subarray

Solved the Maximum Subarray problem using Kadane's Algorithm.

## Approach

* Initialize `currentSum` and `maxSum` with the first element.
* Traverse the array from left to right.
* At each index, decide whether to:
  * Start a new subarray from the current element.
  * Extend the existing subarray.
* Update the maximum sum found so far.

## Complexity

* Time: O(n)

  * n = number of elements in the array

* Space: O(1)

## What I Learned

* Kadane's Algorithm for finding the maximum subarray sum.
* Dynamic Programming optimization.
* How to track local and global maximum values efficiently.
* Solving array problems in linear time.

✅ Day 10 Complete
