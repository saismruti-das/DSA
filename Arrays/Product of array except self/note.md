### 🧩 **Problem** Statement

Return an array `ans` where `ans[i]` is the **product of all elements of `nums` except `nums[i]`**, without using division and in **O(n)** time.

---

### ✅ **Correct Approach: Prefix + Suffix in One Pass (Space Optimized)**

### 📌 Step-by-Step Logic:

1. **Prefix pass:**
    - Initialize `ans[0] = 1`
    - For each index `i`, store product of all elements before `i`:
        
        `ans[i] = ans[i-1] * nums[i-1]`
        
2. **Suffix pass:**
    - Use a variable `suffix = 1`
    - Traverse array from right to left:
        
        `suffix *= nums[i+1]`
        
        `ans[i] *= suffix`
        

➡ This fills each `ans[i]` with:

`(product of all elements before i) * (product of all elements after i)`

---

### 🧠 Also Learned:

✔️ The idea of **building prefix and suffix without extra arrays**

✔️ In-place tricks using just one result array and a scalar variable

✔️ How to break a two-pass logic into an **efficient linear approach**

---

### 🔁 Other Approaches

### 1. **Better (2 extra arrays):**

- Compute and store `prefix[i]` and `suffix[i]` separately.
- Final result = `prefix[i] * suffix[i]`

🟡 Space: O(n) extra

### 2. **Brute Force (nested loops):**

- For each `i`, multiply all elements except `i`
- ❌ Time: O(n²), will TLE for large input

---

### 📈 Time & Space Complexity

| Approach | Time | Space |
| --- | --- | --- |
| Optimal (prefix + suffix) | O(n) | O(1)* |
| Better (2 arrays) | O(n) | O(n) |
| Brute Force | O(n²) | O(1) |

> *O(1) space means no extra arrays used (excluding output array)
> 

---

### 🧪 Follow-up Questions

1. **What if division *was* allowed?**
    
    ➤ Total product ÷ `nums[i]` (skip zeroes carefully)
    
2. **What if the array contains zeroes?**
    
    ➤ Handle separately:
    
    - 0 zeros → use normal logic
    - 1 zero → only that index is non-zero
    - ≥2 zeroes → result = all zeroes
3. **What if you had to solve it for a stream of numbers?**
    
    ➤ Use segment tree or a running prefix/suffix model.
