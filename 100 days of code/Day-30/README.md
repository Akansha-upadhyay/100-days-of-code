# 📊 Day 30 - Combination Sum

Solved the **Combination Sum** problem using the **Backtracking (Depth-First Search)** approach to generate all unique combinations that sum up to the target value.

## Approach

* Initialize an empty list to store all valid combinations.
* Use a recursive backtracking function to explore all possible combinations.
* At each step:
  * If the target becomes `0`, add the current combination to the result.
  * If the target becomes negative, stop exploring that path.
* Iterate through the candidates starting from the current index to avoid duplicate combinations.
* Include the current candidate and recursively search with the reduced target.
* Pass the same index in the recursive call since the same element can be chosen multiple times.
* Backtrack by removing the last added element before exploring the next possibility.

## Complexity

* **Time:** O(2<sup>target</sup>) *(Exponential in the worst case due to exploring all possible combinations.)*
* **Space:** O(target)

Where:

* `target` = target sum value.
* The recursion depth is at most proportional to the target.

## What I Learned

* Applying **Backtracking** to systematically explore all possible combinations.
* Understanding how recursion and backtracking work together to generate valid solutions.
* Reusing the same element by passing the current index in recursive calls.
* Pruning invalid paths early when the remaining target becomes negative.
* Building combinations efficiently while maintaining constant extra space apart from recursion and output.

✅ **Day 30 Complete**
