# 📊 Day 20 - Reverse Integer

Solved the **Reverse Integer** problem by reversing the digits of a 32-bit signed integer while safely handling overflow conditions.

## Approach

* Extract the last digit using `% 10`.
* Remove the last digit using `/ 10`.
* Build the reversed number by multiplying the current result by `10` and adding the extracted digit.
* Check for overflow and underflow before updating the result.
* Return `0` if the reversed integer exceeds the 32-bit signed integer range.

## Complexity

* **Time:** O(log n)
* **Space:** O(1)

## What I Learned

* Reversing an integer digit by digit without using extra space.
* Detecting integer overflow before it occurs.
* Handling negative numbers correctly during reversal.
* Writing robust solutions within 32-bit integer constraints.

✅ **Day 21 Complete**
