# 🌳 Day 13 - Same Tree (LeetCode)



Solved the **Same Tree** problem using **recursion (DFS approach)** by comparing corresponding nodes of two binary trees.

---

## 📌 Problem Statement

Given the roots of two binary trees, check whether they are **identical**.

Two trees are considered the same if:
- They have the same structure
- Corresponding nodes have the same values

---

## 🧠 Approach

We use **recursive Depth First Search (DFS)** to compare both trees node by node.

### 🔑 Conditions:

- If both nodes are `null` → return `true`
- If one node is `null` → return `false`
- If node values are different → return `false`
- Otherwise:
  - Recursively compare left subtrees
  - Recursively compare right subtrees

---

## 🔄 Idea

At every step, we ensure:

- Current nodes match  
- Left subtrees match  
- Right subtrees match  

Only then are the trees identical.

---

## ⏱ Complexity

- **Time Complexity:** O(n)  
  → Every node is visited once

- **Space Complexity:** O(h)  
  → Recursion stack (h = height of tree)

---

## 🧠 What I Learned

- How recursion simplifies tree problems
- Importance of base cases in recursion
- Simultaneous traversal of two trees
- Using DFS for structural comparison

---

## 🎯 Key Takeaway

Tree problems become much easier when broken into smaller recursive comparisons of subtrees.

---

## ✅ Day 13 Complete
