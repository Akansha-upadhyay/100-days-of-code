# Day 18 - Perfect Squares

## Problem
Given an integer `n`, return the least number of perfect square numbers that sum to `n`.

## Approach
- Used **Dynamic Programming**.
- `dp[i]` stores the minimum number of perfect squares required to form `i`.
- For each number, try all possible perfect squares less than or equal to it and update the minimum count.

## Complexity
- **Time:** O(n × √n)
- **Space:** O(n)

## Language
- Java

## Status
✅ Solved
