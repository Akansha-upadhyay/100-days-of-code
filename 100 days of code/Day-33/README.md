#  Day 33 - N-Queens

Solved the **N-Queens** problem using the **Backtracking** approach with optimized **Column and Diagonal Tracking** to efficiently generate all valid board configurations.

## Approach

* Use **backtracking** to place one queen in each row.
* Maintain three boolean arrays to quickly determine whether a queen can be placed:
  * `col[]` → Tracks occupied columns.
  * `diag1[]` → Tracks occupied main diagonals (`row - col + n - 1`).
  * `diag2[]` → Tracks occupied anti-diagonals (`row + col`).
* For each row:
  * Try placing a queen in every column.
  * Skip positions where the column or either diagonal is already occupied.
  * If a position is safe:
    * Place the queen.
    * Mark the corresponding column and diagonals as occupied.
    * Recursively solve for the next row.
  * After returning from recursion:
    * Remove the queen.
    * Unmark the column and diagonals (backtracking).
* When all `n` queens are successfully placed:
  * Convert the board into the required string representation.
  * Add the valid configuration to the result list.

## Complexity

* **Time:** O(N!)
* **Space:** O(N)

Where:

* `N` = size of the chessboard.
* The recursive stack and tracking arrays require **O(N)** extra space.
* The algorithm explores valid queen placements using backtracking.

## What I Learned

* Applying **Backtracking** to systematically explore all possible board configurations.
* Optimizing safety checks using **boolean arrays** instead of scanning the board.
* Representing diagonals using the formulas:
  * Main diagonal: `row - col + n - 1`
  * Anti-diagonal: `row + col`
* Understanding how recursion and backtracking work together to generate all valid solutions.
* Improving backtracking performance with **O(1)** safety checks.

✅ **Day 33 Complete**
