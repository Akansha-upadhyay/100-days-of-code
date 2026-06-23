# 📊 Day 21 - 4Sum

Solved the **4Sum** problem using the **sorting + two-pointer approach** to find all unique quadruplets whose sum equals the target.

## Approach

* Sort the array.
* Fix the first two numbers using nested loops.
* Use two pointers to find the remaining two numbers.
* Skip duplicate values to avoid repeated quadruplets.
* Use `long` for the sum calculation to prevent integer overflow.

## Complexity

* **Time:** O(n³)
* **Space:** O(1) (excluding the output list)

## What I Learned

* Extending the Two Sum and 3Sum patterns to solve 4Sum.
* Combining sorting with the two-pointer technique for efficient searching.
* Handling duplicates carefully to generate unique quadruplets.
* Preventing integer overflow using `long`.

✅ **Day 21 Complete**
