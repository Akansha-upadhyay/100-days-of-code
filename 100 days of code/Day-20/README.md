# 📊 Day 20 - Remove Nth Node From End of List

Solved the **Remove Nth Node From End of List** problem using the **two-pointer (fast and slow pointer) approach** to remove the target node in a single traversal.

## Approach

* Create a dummy node pointing to the head.
* Move the `fast` pointer `n + 1` steps ahead.
* Move both `fast` and `slow` pointers together until `fast` reaches the end.
* Remove the target node by updating the `next` pointer of the `slow` node.
* Return the updated list starting from the dummy node.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## What I Learned

* Using the fast and slow pointer technique on linked lists.
* Handling edge cases with a dummy node.
* Removing the nth node from the end in a single pass.
* Simplifying linked list operations by avoiding separate length calculations.

✅ **Day 20 Complete**
