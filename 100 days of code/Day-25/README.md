# 📊 Day 25 - Intersection of Two Arrays

Solved the **Intersection of Two Arrays** problem using the **HashSet** approach to efficiently find all unique common elements between two arrays.

## Approach

* Store all elements of the first array (`nums1`) in a `HashSet`.
* Traverse the second array (`nums2`).
* Check if each element exists in the first set.
* Add common elements to another `HashSet` to ensure uniqueness.
* Convert the result set into an integer array and return it.

## Complexity

* **Time:** O(n + m)
* **Space:** O(n)

Where:

* `n` = length of `nums1`.
* `m` = length of `nums2`.

## What I Learned

* Using `HashSet` for efficient lookup operations with **O(1)** average time complexity.
* Eliminating duplicate elements by storing results in a set.
* Converting a `HashSet<Integer>` into an `int[]` for the required output format.
* Applying hash-based data structures to solve array intersection problems efficiently.

✅ **Day 25 Complete**
