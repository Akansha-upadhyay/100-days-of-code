# 📊 Day 26 - Intersection of Two Arrays II

Solved the **Intersection of Two Arrays II** problem using the **HashMap (Frequency Count)** approach to efficiently find all common elements, including duplicates.

## Approach

* Create a `HashMap` to store the frequency of each element in the first array (`nums1`).
* Traverse the second array (`nums2`).
* Check if the current element exists in the map with a frequency greater than `0`.
* Add the element to the result list and decrement its frequency in the map.
* Convert the result list into an integer array and return it.

## Complexity

* **Time:** O(n + m)
* **Space:** O(min(n, m))

Where:

* `n` = length of `nums1`.
* `m` = length of `nums2`.

## What I Learned

* Using a `HashMap` to store and update the frequency of elements efficiently.
* Handling duplicate elements by maintaining occurrence counts.
* Converting an `ArrayList<Integer>` into an `int[]` for the required output format.
* Applying frequency counting with hash-based data structures to solve array intersection problems efficiently.

✅ **Day 26 Complete**
