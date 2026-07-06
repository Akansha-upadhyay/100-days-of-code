# 📊 Day 28 - Third Maximum Number

Solved the **Third Maximum Number** problem using the **Three Variables Tracking** approach to efficiently find the third distinct maximum number in a single traversal.

## Approach

* Maintain three variables: `first`, `second`, and `third` to store the top three distinct maximum values.
* Use `Long` objects initialized as `null` to handle edge cases, including `Integer.MIN_VALUE`.
* Traverse the array once:
  * Skip duplicate values to ensure only distinct numbers are considered.
  * Update `first`, `second`, and `third` whenever a larger distinct number is found.
* After processing all elements:
  * Return the third maximum if it exists.
  * Otherwise, return the maximum number.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

Where:

* `n` = length of the input array.

## What I Learned

* Tracking multiple maximum values efficiently without sorting the array.
* Handling duplicate values by ignoring already recorded maximums.
* Using `Long` instead of `Integer` to safely handle edge cases like `Integer.MIN_VALUE`.
* Solving optimization problems in **one pass** with **constant extra space**.

✅ **Day 28 Complete**
