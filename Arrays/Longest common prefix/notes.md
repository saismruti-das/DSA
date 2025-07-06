**Language:** Python  
**Problem:** LeetCode #14 Longest common prefix 
**Topic:** Array, Strings  
**Difficulty:** Easy

---

## 🎯 Problem Summary
Given an array of strings ```strs```, return the longest common prefix among them.
If there is no common prefix, return an empty string ```""```.

---

## 💡 Approach: Vertical Scanning (Character-by-Character)

- Compare characters column-by-column (top to bottom)
- Stop immediately when:
  - You reach the end of any word
  - A mismatch occurs at that position
- Return the substring from the first word up to the last matched index

---

## 🧠 Learning

- Time Complexity: O(n × m)
```n = number of strings```, ```m = length of the shortest string```
- Space Complexity: **O(1)** — no extra memory used (excluding the result)
- Efficient for most real-world cases

---

## 🧠 Edge Cases to Handle

- Empty list → return ```""```
- Only one word → return that word
- No common characters → return ```""```

---
