### 💡 **Problem:**

Check if a given string is a palindrome, **considering only alphanumeric characters** and **ignoring cases**.

---

#### **1. Clean String Approach:**

* Create new cleaned string with only alphanumeric elements.
* Use two pointers left and right to check palindrome.

* Time: **O(n)**
* Space: **O(n)** (extra string)

---

#### **2. Skip Element Approach (Optimized & Preferred):**

* Use two pointer
* Check if each character is letter or digit
  * If not skip it
  * else palindrome

✅ **Benefits:**

* Time: **O(n)**
* Space: **O(1)** (no extra string)

---

#### **3. Preprocessing + Reverse Comparison (Alternate Approach):**

  * Create a new filtered string with only lowercase alphanumeric characters
  * Compare it with its reverse using slicing

✅ **Example:**

```python
s = ''.join(c.lower() for c in s if c.isalnum())
return s == s[::-1]
```

❗ **Downside:**

* Extra space to store the cleaned string
* Less optimal in space compared to two-pointer

---
