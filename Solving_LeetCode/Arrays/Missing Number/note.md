- Using Bit Manipulation
    
    ### 🧠 XOR Properties:
    
    - `a ^ a = 0`
    - `a ^ 0 = a`
    
    ---
    
    ### 💡 Core Logic:
    
    If no number were missing, then:
    
    ```jsx
    XOR of all expected numbers (0 to n)
    ^ XOR of all actual numbers in array (length n)
    = 0
    ```
    
    But if one number is missing, this XOR will give that number as the result.
    
    ---
    
    ### 🔍 Example:
    
    Let:
    
    - `actual nums = [0, 1, 2]`
    - `expected nums = [0, 1, 2, 3]`
    
    Then:
    
    ```java
    (0 ^ 1 ^ 2 ^ 3) ^ (0 ^ 1 ^ 2) = 3
    ```
    
    All values cancel out except the missing number `3`.
    
    ---
    
    ### 🛠 Implementation Logic:
    
    - Loop through index `i` from `0` to `n-1`
    - XOR all expected indices `i` with actual values `nums[i]`
    - Start `result = n` to include the last expected number (`n`)
    
    ```python
    result = n
    for i in range(n):
        result ^= i ^ nums[i]
    return result
    ```
    
    Final `result` will be the missing number.
    
    ---
    

### ✅ Correct Approach (✔️)

- **Logic:** Use the formula for sum of first `n` natural numbers and subtract the actual array sum to find the missing number.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

### 🧠 Other Attempts

**❌ Attempt 1 (Brute-force check using `if i not in nums`):**

- **Idea:** Loop from 0 to n, return the first number not in the array.
- **Issue:** `in` operation is O(n), resulting in O(n²) time.
- **Time/Space:** O(n²), O(1)

**❌ Attempt 2 (Sorting + Binary Search):**

- **Idea:** Sort the array and use binary search to check if each number 0–n exists.
- **Issue:** Sorting adds extra time complexity.
- **Time/Space:** O(n log n), O(1)

---

### 🔁 Thought Process

- Started with brute force (membership check).
- Moved to binary search with sorting.
- Realized the optimal solution uses the sum formula.

---

### ❓ Follow-Up Questions + Answers

- **Can you solve this in-place without using sum or extra space?**
    
    ✔️ Yes. Use **XOR** approach: XOR all indices and all elements.
    
    ```python
    result = len(nums)
    for i in range(len(nums)):
        result ^= i ^ nums[i]
    return result
    
    ```
    
    - **Time/Space:** O(n), O(1)
- **What if the numbers were not guaranteed to be unique?**
    
    ✖️ Then the "missing number" definition breaks.
    
    ➤ You’d need to detect duplicates and missing using a **frequency array** or **hash set**.
    
- **What if the input size is too large for integer sum?**
    
    ➤ Use XOR method instead — it doesn’t depend on arithmetic that can overflow.
