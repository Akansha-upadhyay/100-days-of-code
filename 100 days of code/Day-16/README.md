# 🏔️ Day 16 - Find in Mountain Array

Solved the **Find in Mountain Array** problem using **binary search** to locate the peak element and efficiently search both halves of the mountain array.

## Approach

- Find the peak element using binary search.
- Perform binary search on the increasing (left) half.
- If the target is not found, perform binary search on the decreasing (right) half.
- Return the minimum index where the target is found.
- Return `-1` if the target does not exist in the array.

## Complexity

- **Time:** O(log n)
- **Space:** O(1)

## What I Learned

- How to find the peak element in a mountain array using binary search.
- Applying binary search on both ascending and descending sorted arrays.
- Modifying binary search conditions for a descending order array.
- Solving interactive problems efficiently while minimizing API calls.

✅ **Day 16 Complete**
