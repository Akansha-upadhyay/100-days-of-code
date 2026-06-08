# Day 8 - Group Anagrams

Solved the Group Anagrams problem using a HashMap and sorted strings.

## Approach

* Convert each string into a character array.
* Sort the characters to create a unique key.
* Use a HashMap to group strings with the same sorted key.
* Return all grouped anagrams as a list of lists.

## Complexity

* Time: O(n × k log k)

  * n = number of strings
  * k = average length of each string

* Space: O(n × k)

## What I Learned

* Using HashMap for grouping related data.
* Converting strings to character arrays.
* Sorting characters with Arrays.sort().
* Working with nested collections in Java.

✅ Day 8 Complete
