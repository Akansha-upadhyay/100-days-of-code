# 📊 Day 31 - Set Mismatch

Solved the **Set Mismatch** problem using the **Negative Marking** technique to efficiently identify the duplicated and missing numbers in the array.

## Approach

* Initialize two variables to store the duplicate and missing numbers.
* Traverse the array once:
  * For each number, calculate its corresponding index using its absolute value.
  * If the value at that index is already negative, the current number is the duplicate.
  * Otherwise, mark that index as visited by making its value negative.
* Traverse the array a second time:
  * The index containing a positive value indicates the missing number.
* Return the duplicate and missing numbers as an array.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

Where:

* `n` = length of the input array.
* The algorithm performs two linear traversals while using constant extra space.

## What I Learned

* Using **Negative Marking** to track visited elements without extra memory.
* Leveraging array indices to detect duplicate values efficiently.
* Identifying the missing number by checking unvisited indices.
* Solving array problems in **O(n)** time with **O(1)** auxiliary space.
* Applying in-place modification techniques to optimize space complexity.

✅ **Day 31 Complete**
