# 🧠 HashMap – Quick Notes

## 🔹 What is a HashMap?

A `HashMap` is a **data structure** that stores **key-value pairs**. 
It allows **fast lookup**, **insertion**, and **deletion** in average constant time **O(1)**.

---

## 📦 Features

- No duplicate keys allowed
- Keys must be unique, values can be duplicated
- Uses **hashing** to map keys to indices
- Order is **not guaranteed**
  - Use `LinkedHashMap` in Java to preserve insertion order
  - Use `OrderedDict` (before Python 3.7)

---

## 🔹 Java HashMap (java.util.HashMap)

```java
// Declaration
HashMap<Integer, String> map = new HashMap<>();

// Add elements
map.put(1, "Apple");
map.put(2, "Banana");

// Access elements
String fruit = map.get(1); // Apple

// Check if key/value exists
map.containsKey(2); // true
map.containsValue("Banana"); // true

// Remove an entry
map.remove(1);

// Size
int size = map.size();

// Iterate
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```
## 🔹 Python Equivalent (dict)

```Python
# Declaration
my_map = {}

# Add elements
my_map[1] = "Apple"
my_map[2] = "Banana"

# Access elements
fruit = my_map.get(1)  # Apple

# Check if key exists
2 in my_map  # True

# Remove an entry
my_map.pop(1)

# Size
size = len(my_map)

# Iterate
for key, value in my_map.items():
    print(f"{key}: {value}")
```

## ⌛Time Complexity (Average Case)

- **Insertion** -> *O(1)*
- **Deletion** -> *O(1)*
- **Lookup (get)** -> *O(1)
- **Iteration** -> *O(n)*

```🔔 Worst-case is O(n) due to hash collisions (rare with good hash functions)```

## 🧩 Common Use Cases

- Counting frequency of elements
- Caching (storing previously computed results)
- Mapping IDs to names, prices, etc.
- Lookup tables (e.g., phonebooks, configs)

## 🧠 Interview Tips

- Understand hashing and collisions
- Java: Know about ```.hashCode()``` and ```.equals()```
- Understand rehashing/resizing
- Practice these LeetCode problems:

    - ✅ Two Sum
    - ✅ Group Anagrams
    - ✅ Longest Consecutive Sequence
    - ✅ Subarray Sum Equals K

