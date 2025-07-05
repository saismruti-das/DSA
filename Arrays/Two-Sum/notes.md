**Language:** Java  
**Problem:** LeetCode #1  
**Topic:** Arrays  
**Difficulty:** Easy

---

## 🎯 Problem Summary
Given an array of integers `nums` and an integer `target`, return indices of two numbers such that they add up to the target. Assume only one solution exists.

---

## 💡 Approach-1: Brute Force (Nested Loop)

- Use two loops to check every pair `(i, j)`
- If `nums[i] + nums[j] == target`, return `[i, j]`

---

## 💻 Code (Java)
See `code1.java` file

---

## 🧠 Learning

- Time Complexity: **O(n²)** — not efficient for large arrays
- Space Complexity: **O(1)** — no extra space
- Can be improved using a **hash map** for O(n) time

---

## ✅ Next Step

Try solving it again using:
- Hashing (store `target - nums[i]` in map)
- One-pass efficient method
