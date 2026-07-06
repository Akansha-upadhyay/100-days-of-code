# 📊 Day 27 - Find the Difference

Solved the **Find the Difference** problem using the **Bit Manipulation (XOR)** approach to efficiently identify the extra character.

## Approach

* Initialize an integer variable `xor` with `0`.
* Traverse the first string (`s`) and perform the XOR (`^`) operation with each character.
* Traverse the second string (`t`) and again perform the XOR operation with each character.
* Since every character appearing in both strings cancels itself out (`a ^ a = 0`), only the extra character remains.
* Convert the final XOR value back to a character and return it.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

Where:

* `n` = length of the longer string (`t`).

## What I Learned

* Using the XOR (`^`) operator to solve problems involving missing or extra elements.
* Understanding the properties of XOR:
  * `a ^ a = 0`
  * `a ^ 0 = a`
  * XOR is both commutative and associative.
* Solving problems with **constant extra space** using bit manipulation.
* Applying bitwise operations as an efficient alternative to frequency counting or sorting.

✅ **Day 27 Complete**
