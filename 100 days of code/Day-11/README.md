# Day 11 - Merge Intervals

Solved the Merge Intervals problem by first sorting the intervals and then merging overlapping ranges.

## Approach

- Sort all intervals based on their starting value.
- Initialize the first interval as the current interval.
- Traverse the remaining intervals:
  - If the current interval overlaps with the next interval, merge them by updating the end value.
  - Otherwise, add the current interval to the result and move to the next interval.
- Add the last merged interval to the result.

## Complexity

- Time: O(n log n) (sorting dominates)
- Space: O(n)

## What I Learned

- How sorting simplifies interval-based problems.
- Detecting overlaps using interval boundaries.
- Using ArrayList to dynamically store merged intervals.
- Converting a List<int[]> back to int[][].

✅ Day 11 Complete
