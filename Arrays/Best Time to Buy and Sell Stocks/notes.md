### ✅ Problem Statement (LeetCode 121)

You are given an integer array `prices` where `prices[i]` is the price of a stock on the `i-th` day.

You want to maximize your profit by choosing a **single day to buy** and a **different future day to sell**.

Return the **maximum profit** you can achieve. If no profit is possible, return `0`.

---

### 🔍 Constraints

- `1 <= prices.length <= 10⁵`
- `0 <= prices[i] <= 10⁴`

---

### 🧠 Thought Process + Approaches

### 1. **Brute-force (Two Nested Loops)**

- Try every pair `(i, j)` where `i < j`.
- For each pair, calculate profit: `prices[j] - prices[i]`.
- Track the **maximum profit**.
- ❌ **Inefficient** for large inputs.
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1)

### 2. **Separate Loops to Find Min and Max**

- First loop: find `min_price` and store the index.
- Second loop: from that index onwards, find `max_price`.
- Return `max_price - min_price`.
- ❌ **Incorrect logic**: Max profit is not guaranteed if you fix buying at absolute minimum; better buying day might be just before a peak.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **⚠️ Logical flaw**: This assumes profit is only max if you buy at the lowest point, which isn't always true if local peaks are better.

---

### 🧠 Optimized Logic (Pseudocode)

```
1. Initialize min_price as prices[0], profit as 0.
2. Loop through each price:
    a. If current price is less than min_price → update min_price.
    b. Else → calculate profit as current price - min_price.
    c. Update max profit if this profit is higher.
3. Return max profit.

```

### 🔍 Breakdown of Thought Process

- You want to buy at the **lowest price so far**.
- At every step, check if selling now (at today's price) gives better profit than before.
- Keep updating the profit.
- Even if the price keeps dropping, you keep track of the minimum so far.

---

### 📈 Time and Space Complexity

- **Time:** O(n) → Single traversal of array.
- **Space:** O(1) → Constant extra space.

---

### ✅ Key Takeaway

> Track the minimum price so far, and calculate potential profit at every step. Update the max profit dynamically.
> 

This approach avoids unnecessary comparisons and ensures **optimal time efficiency** while handling all edge cases.

---
