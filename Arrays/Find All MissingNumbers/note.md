## 🧩 Problem Statement

You are given an integer array `nums` of length `n`, where each number is in the range `[1, n]`. Some elements appear once, and others may be missing.

### 🔹 Objective:

Return **all the numbers from 1 to n** that **do not appear** in `nums`.

---

## 💡 Thought Process:

- The naive way is to use a **hash set** to store all present elements, then loop from `1 to n` to find missing ones.
- But that uses extra space.
- Then I noticed:
    - All values are in `[1, n]`
    - We could **map values to indices** (`val -> val - 1`)
- So we can mark a value **as visited** by making its corresponding index **negative**.

---

## ✅ Optimized Approach (In-Place Marking)

### 🔧 Idea:

For each number `num` in the array, mark the index `abs(num) - 1` as negative. After that, any index `i` that still has a **positive** value means `i+1` is **missing**.

### 🧠 Steps:

1. Loop through `nums`:
    - For each `num`, mark `nums[abs(num) - 1]` negative.
    - Use `abs()` to handle already-negatives.
2. Loop again:
    - If `nums[i] > 0`, then `i+1` is missing.

### ⏱ Time Complexity: `O(n)`

### 💾 Space Complexity: `O(1)` (excluding output list)

---

## 🔁 Other Approaches:

### 1. **Using HashSet**

- Add all elements to a HashSet.
- Check from `1` to `n` which values are missing.

**Time:** `O(n)`

**Space:** `O(n)`

### 2. **Using Boolean Array**

- Mark visited values in a boolean array of size `n`.

**Time:** `O(n)`

**Space:** `O(n)`

### 3. **Sort and Compare**

- Sort the array and find gaps between numbers.

**Time:** `O(n log n)`

**Space:** `O(1)` (if in-place)

---

## 🔚 Summary:

| Approach | Time | Space | Notes |
| --- | --- | --- | --- |
| In-place marking | `O(n)` | `O(1)` | ✅ Optimized |
| HashSet | `O(n)` | `O(n)` | Simple, but uses extra space |
| Boolean array | `O(n)` | `O(n)` | Also uses space |
| Sort and compare | `O(n log n)` | `O(1)` | Only if array modifiable |

---

## ❓ Follow-up Questions (with Answers):

1. **Find all numbers that appear twice?**
    
    → Use the same in-place marking trick: if the index is already negative, it's a duplicate.
    
2. **What if you can't modify the array?**
    
    → Use a HashSet or boolean array → `O(n)` time, `O(n)` space.
    
3. **Can you solve it in one pass?**
    
    → No, we need two passes: one to mark and one to collect.
    
4. **What if array is very large, no extra space, and can't modify?**
    
    → Not possible in `O(n)` time. Use sorting if allowed (`O(n log n)` time, `O(1)` space).
