# 📊 Day 29 - Array Partition

Solved the **Array Partition** problem using the **Sorting + Greedy** approach to maximize the sum of the minimum values of each pair.

## Approach

* Sort the input array in ascending order.
* Pair adjacent elements after sorting.
* Since the smaller element of each pair contributes to the final sum, add every element at the even index (`0, 2, 4, ...`) to the result.
* Return the computed sum.

## Complexity

* **Time:** O(n log n)
* **Space:** O(1) *(Ignoring the space used by the sorting algorithm.)*

Where:

* `n` = length of the input array.

## What I Learned

* Applying the **Greedy** strategy by pairing adjacent elements after sorting to maximize the overall sum.
* Understanding why sorting ensures the optimal pairing of numbers.
* Using `Arrays.sort()` to simplify array-based problems.
* Identifying patterns where only every alternate element contributes to the final answer.

✅ **Day 29 Complete**
