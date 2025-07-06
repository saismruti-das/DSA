**Language:** Java  
**Problem:** LeetCode #1 Two Sum - HashMap 
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

## 🧠 Learning

- Time Complexity: **O(n²)** — not efficient for large arrays
- Space Complexity: **O(1)** — no extra space
- Can be improved using a **hash map** for O(n) time

---

## ✅ Next Step

Try solving it again using:
- Hashing (store `target - nums[i]` in map)
- One-pass efficient method

---
## 💡 Approach-2: Optimized Using HashMap (One-pass)

- Traverse the array once
- For each element, calculate the complement: `target - nums[i]`
- Check if that complement exists in a HashMap `(number → index)`
- If yes, return the index of complement and current index
- If no, store the current number and its index

---

## 🧠 Learning

- Time Complexity: **O(n)** — single loop
- Space Complexity: **O(n)** — HashMap stores up to n elements
- Common pattern in problems like: "Find pair with sum X"
