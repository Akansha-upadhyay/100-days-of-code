# Day 05 - Roman to Integer

Solved the Roman to Integer problem by traversing the string and handling subtraction cases when a smaller Roman numeral appears before a larger one.

## Approach

* Converted each Roman numeral to its integer value.
* Compared the current value with the next value.
* Subtracted when the current value was smaller; otherwise added it.
* Returned the final integer value.

## Complexity

* Time: O(n)
* Space: O(1)

## What I Learned

* Greedy approach
* Character-to-value mapping
* Handling special numeral cases efficiently

✅ Day 05 Complete
