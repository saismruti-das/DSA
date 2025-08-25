### 🧩 **Problem Statement**

You’re given an integer array `nums`, and need to efficiently **handle multiple queries** asking for the sum of elements between two indices `left` and `right`.

Given an integer array `nums`, handle multiple queries of the following type:

1. Calculate the **sum** of the elements of `nums` between indices `left` and `right` **inclusive** where `left <= right`.

Implement the `NumArray` class:

- `NumArray(int[] nums)` Initializes the object with the integer array `nums`.
- `int sumRange(int left, int right)` Returns the **sum** of the elements of `nums` between indices `left` and `right` **inclusive** (i.e. `nums[left] + nums[left + 1] + ... + nums[right]`).

**Example 1:**

```
Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
```

---

### ✅ **Correct Approach: Prefix Sum Preprocessing**

### 📌 Steps / Pseudocode:

1. Preprocess the input array to convert it into a **prefix sum array**:
    - `prefix[i] = prefix[i-1] + nums[i]`
    - This stores cumulative sums from the start.
2. To calculate the sum from index `left` to `right`:
    - If `left == 0`, return `prefix[right]`
    - Otherwise, return `prefix[right] - prefix[left - 1]`

### 🎯 Intuition:

Instead of summing up a subarray during each query (which would take O(n) time), **precompute cumulative sums**, so each query takes **O(1)** time.

---

### 📈 Time & Space Complexity

| Part | Time Complexity | Space Complexity |
| --- | --- | --- |
| Constructor (preprocess) | O(n) | O(1) (in-place) |
| sumRange query | O(1) | O(1) |

*Alternate*: If you store a new prefix array → Space becomes **O(n)**.

---

### ❌ Other Approaches

### 1. **Naive Brute Force (Per Query Loop)**

- Loop from `left` to `right` on each call to `sumRange`.
- ❌ Inefficient for many queries (TLE risk).

### 2. **Prefix Sum with New Array**

- Store a separate `prefixSum[]` instead of modifying `nums`.
- ✅ Cleaner for real-world usage when original data shouldn't be altered.

---

### ❓ Follow-up Questions

1. **What if the array is mutable (values can change)?**
    
    ➤ Use **Segment Tree** or **Binary Indexed Tree (Fenwick Tree)**.
    
2. **What if queries are on a 2D matrix?**
    
    ➤ Prefix sum in 2D: `prefix[i][j] = matrix[i][j] + top + left - overlap`
    
3. **How to return average instead of sum in range?**
    
    ➤ Return `sum / (right - left + 1)` using the same prefix logic.
    

---
