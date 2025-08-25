### 💡 **Problem:**

Check if two strings `s` and `t` are **anagrams** — i.e., they contain the same characters with the same frequency, regardless of order.

---

#### **1. Sorting-Based Approach**
* **Logic:**

  *  Make sure both strings are of same length
  * Convert both strings to character arrays
  * Sort both arrays
  * Compare them

* **Code Idea:**

  ```java
  char[] sArr = s.toCharArray();
  char[] tArr = t.toCharArray();
  Arrays.sort(sArr);
  Arrays.sort(tArr);
  return Arrays.equals(sArr, tArr);
  ```

* **Time Complexity:** O(n log n) - ``` n- traversing array, log n- sorting ```

* **Space Complexity:** O(n) - ``` new arrays created ```  

✅ **Pros:** Simple and easy to implement
❌ **Cons:** Not the most efficient due to sorting

---

#### **2. HashMap/Character Count Approach**

* **Logic:**
  *  Make sure both strings are of same length
  * Count character frequency of characters of `s` using a HashMap or array
  * Decrease the count while iterating over `t`
  * At the end, all counts should be zero

* **Code Idea (Java):**

  ```java
  if (s.length() != t.length()) return false;

  int[] count = new int[26]; // assuming lowercase only

  for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++;
      count[t.charAt(i) - 'a']--;
  }

  for (int c : count) {
      if (c != 0) return false;
  }

  return true;
  ```

* **Time Complexity:** O(n)

* **Space Complexity:** O(1) ```(fixed array size)``` or O(k) ```(k unique elements in HashMap)```

✅ **Pros:** Efficient
✅ **Best choice for performance**
❌ **Requires handling case sensitivity and character range**

---
