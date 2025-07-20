### 🔹 Problem: Contains Duplicate

**Statement:**

Given an integer array `nums`, return `true` if any value appears **at least twice**, and return `false` if every element is **distinct**.

---

### 🔹 Brute Force Approach

**Idea:** Compare every pair of elements.

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`

---

### 🔹 Optimal Solution using HashSet ✅

**Idea:** Use a `HashSet` to store seen numbers. If a number is already present, it's a duplicate.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`
