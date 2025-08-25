### 🧩 **Problem** Statement

Given an integer `n`, return *an array* `ans` *of length* `n + 1` *such that for each* `i` **(`0 <= i <= n`)*,* `ans[i]` *is the **number of*** `1`***'s** in the binary representation of* `i`.

---

### ✅ **Approach 1: DP with Bit Manipulation (Best)**

### 📌 Key Insight:

> The number of 1s in i = number of 1s in i >> 1 + (i & 1)
> 

### 🧠 Why It Works:

- `i >> 1` is `i` divided by 2 (dropping the last bit)
- `i & 1` gives us 1 if `i` is odd (i.e., ends in 1), 0 if even

### 💡 Formula:

```java
countBits[i] = countBits[i >> 1] + (i & 1)
```

### 🔁 Example:

```java
i = 5 (binary 101)
i >> 1 = 2 (binary 10)
i & 1 = 1
→ countBits[5] = countBits[2] + 1 = 1 + 1 = 2
```

---

### ✅ **Approach 2: Power-of-2 Optimized DP (Your Code)**

1. Base: `ans[0] = 0`
2. Loop from 1 to n:
    - If `i` is a power of 2: `ans[i] = 1`
    - If even: `ans[i] = ans[i / 2]`
    - If odd: `ans[i] = ans[i / 2] + 1`

### 🧠 Bit Trick You Learned:

✔️ To check if a number is a **power of 2**:

```java
n & (n - 1) == 0
```

---

### 📈 Time & Space Complexity

| Approach | Time | Space |
| --- | --- | --- |
| Bit Manipulation (i >> 1 + i&1) | O(n) | O(n) |
| DP with power-of-2 check | O(n) | O(n) |
| Brute-force (count bits manually) | O(n log n) | O(n) |

---

### 🧪 Follow-up Questions

1. **Can you do it in-place (returning the same input array)?**
    
    ➤ Yes, if input is mutable.
    
2. **Can you return the count for only odd or even numbers?**
    
    ➤ Just filter final result accordingly.
    
3. Can we do using any in-built fuction?
    
    ➤ using`Integer.bitCount(int n)`
    
    - **Returns the number of 1-bits** (set bits) in the binary representation of `n`.
    - This is the **most direct built-in way** to solve the Counting Bits problem.
    
    ```java
    int count = Integer.bitCount(5);  // returns 2, because 5 in binary is 101
    ```
    
    ✅ **Can be used to solve the problem in one line per number.**
