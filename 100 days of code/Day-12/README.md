# Day 13 - Same Tree

Solved the Same Tree problem using recursion by comparing corresponding nodes of both binary trees.

## Approach

- If both nodes are `null`, return `true`.
- If one node is `null`, return `false`.
- If the values of the current nodes are different, return `false`.
- Recursively compare:
  - Left subtree of both trees.
  - Right subtree of both trees.
- Return `true` only if both left and right subtrees are identical.

## Complexity

- Time: O(n)
- Space: O(h)
  - `h` is the height of the tree (recursion stack).

## What I Learned

- How recursion simplifies tree comparison problems.
- Handling base cases for binary trees.
- Comparing both tree structure and node values simultaneously.
- Understanding recursive Depth-First Search (DFS) on binary trees.

✅ Day 13 Complete
