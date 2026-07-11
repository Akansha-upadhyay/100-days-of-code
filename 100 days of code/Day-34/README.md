#  Day 34 - Largest Number

Solved the **Largest Number** problem using the **Greedy Sorting** approach with a **Custom Comparator** to arrange numbers in the order that produces the largest possible concatenated value.

## Approach

* Convert each integer into its **string representation**.
* Sort the array of strings using a **custom comparator**:
  * Compare `(a + b)` and `(b + a)`.
  * If `(b + a)` is larger, place `b` before `a`.
* This ordering ensures that every pair of numbers contributes to the maximum possible final number.
* After sorting:
  * If the first element is `"0"`, return `"0"` to correctly handle inputs like `[0,0]`.
  * Otherwise, concatenate all strings using a **StringBuilder**.
* Return the resulting string representing the largest possible number.

## Complexity

* **Time:** O(N log N × K)
* **Space:** O(N)

Where:

* `N` = number of elements in the array.
* `K` = average number of digits per number (maximum 10).
* Sorting dominates the overall time complexity, while the string array requires **O(N)** extra space.

## What I Learned

* Solving greedy problems using a **custom sorting comparator**.
* Comparing concatenated strings (`a + b` vs `b + a`) instead of comparing numerical values directly.
* Handling special edge cases such as arrays containing only zeros.
* Using **StringBuilder** for efficient string concatenation.
* Understanding how custom comparators can define the optimal ordering for non-standard sorting problems.

✅ **Day 34 Complete**
