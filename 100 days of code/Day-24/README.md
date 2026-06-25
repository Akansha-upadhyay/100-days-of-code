# 📊 Day 24 - Binary Tree Inorder Traversal

Solved the **Binary Tree Inorder Traversal** problem using the **Depth-First Search (DFS)** recursive approach to traverse a binary tree in inorder sequence.

## Approach

* Inorder traversal follows the order: **Left → Root → Right**.
* Create a result list to store the traversal.
* Recursively visit the left subtree.
* Add the current node's value to the result list.
* Recursively visit the right subtree.
* Return the completed traversal list.

## Complexity

* **Time:** O(n)
* **Space:** O(h)

Where:

* `n` = number of nodes in the tree.
* `h` = height of the tree (recursive call stack).

## What I Learned

* Understanding the inorder traversal pattern: **Left → Root → Right**.
* Applying recursion to traverse binary trees efficiently.
* Managing recursive base cases using `null` checks.
* Analyzing recursive tree traversal time and space complexity.

✅ **Day 24 Complete**
