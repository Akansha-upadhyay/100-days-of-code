# 📊 Day 22 - Sqrt(x)

Solved the **Sqrt(x)** problem using the **Binary Search** approach to efficiently find the integer square root of a non-negative integer.

## Approach

* Handle the edge cases where `x` is `0` or `1`.
* Use binary search on the range `[1, x / 2]`.
* Calculate `mid * mid` and compare it with `x`.
* If the square equals `x`, return `mid`.
* If the square is less than `x`, store `mid` as a potential answer and search the right half.
* Otherwise, search the left half.
* Return the last valid answer, which represents the floor of the square root.

## Complexity

* **Time:** O(log x)
* **Space:** O(1)

## What I Learned

* Applying binary search to problems beyond searching in sorted arrays.
* Avoiding integer overflow by using `long` when calculating `mid * mid`.
* Finding the floor value of a result using binary search.
* Handling edge cases efficiently before starting the search.

✅ **Day 22 Complete**
