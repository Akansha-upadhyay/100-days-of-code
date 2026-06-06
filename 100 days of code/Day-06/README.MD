# Day 6 - Valid Parentheses

Solved the Valid Parentheses problem using a stack.

### Approach

* Traverse the string one character at a time.
* Push opening brackets onto the stack.
* When a closing bracket is found, check if it matches the most recent opening bracket.
* If the brackets don't match or the stack is empty, return `false`.
* At the end, the stack should be empty for the string to be valid.

### Complexity

* Time: O(n)
* Space: O(n)

### What I Learned

* How the Stack data structure works
* Matching opening and closing brackets efficiently
* Handling edge cases with empty stacks

**Language:** Java
**Difficulty:** Easy

✅ Day 6 Complete
