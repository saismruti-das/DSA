### 📝 **Problem Statement**

Alice types a string on her keyboard but may **hold a key too long**—resulting in one character being **repeated more than once**, but this happens **at most once**.

You're given the final `word`.
Return the **number of possible original strings** Alice could have meant.

---

### 🔍 **Examples**

#### Example 1:

```
Input:  word = "abbcccc"
Output: 5
Explanation: Alice may have held 'c' too long or 'b'.
Possible originals: "abbc", "abbcc", "abbccc", "abbcccc", "abcccc"
```

#### Example 2:

```
Input:  word = "abcd"
Output: 1
Only possibility: "abcd"
```

#### Example 3:

```
Input: word = "aaaa"
Output: 4
Explanation: Original could be: "a", "aa", "aaa", "aaaa"
```

---
> ✅ We only need to count **consecutive duplicate characters** — as these are the only places Alice could’ve over-pressed once.

### ⏱️ **Time and Space Complexity**

| Metric           | Value  |
| ---------------- | ------ |
| Time Complexity  | `O(n)` |
| Space Complexity | `O(1)` |

---

### 💬 **Common Interview Questions Similar To This**

* [x] Long Pressed Name (Leetcode 925)
* [x] Remove Duplicates from String
* [x] Count Compressed Variations (Run-length encoding variants)
* [x] Grouped Characters / Streaks in a string
