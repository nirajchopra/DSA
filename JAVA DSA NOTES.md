Here is the complete set of notes converted into a highly structured, attractive, and study-friendly Markdown format. I have preserved every single detail, definition, and example from your text while enhancing the visual hierarchy.

***

# ☕ Java DSA: Comprehensive Study Notes

## 📌 Table of Contents
1. [Introduction to Programming](#introduction-to-programming)
2. [Language Types & Memory](#language-types--memory)
3. [Program Flow & Logic](#program-flow--logic)
4. [Java Architecture (JVM, JRE, JDK)](#java-architecture)
5. [Java Basics & Syntax](#java-basics--syntax)
6. [Control Flow & Loops](#control-flow--loops)
7. [Functions & Methods](#functions--methods)
8. [Arrays & ArrayLists](#arrays--arraylists)
9. [Searching Algorithms](#searching-algorithms)
10. [Sorting Algorithms](#sorting-algorithms)
11. [Strings & StringBuilder](#strings--stringbuilder)
12. [Pattern Problems](#pattern-problems)
13. [Recursion: The Fundamentals](#recursion-fundamentals)
14. [Recursion: Practical Applications](#recursion-applications)
15. [Recursion: Advanced Concepts & Math](#recursion-advanced)

---

## 🌐 Introduction to Programming
Computers work at a very minute level and only understand **0's and 1's (Binary language)**.

**What is a Programming Language?**
*   **Human Communication:** Human (Speak) $\rightarrow$ Language (Hindi/English) $\rightarrow$ Human (Listen)
*   **Computer Communication:** Human (Write Code) $\rightarrow$ Programming Language (Java/Python) $\rightarrow$ Computer (Converted into 0's and 1's)

### 🛠 Types of Programming Languages
1.  **Procedural Programming**
    *   Series of well-structured steps and procedures.
    *   Systematic order of statements, functions, and commands.
    *   **Focus:** *How* to perform the task.
2.  **Functional Programming**
    *   Written using pure functions.
    *   Variables are never modified; new ones are created as output.
    *   Used for heavy operations on the same data set (e.g., Machine Learning).
3.  **Object Oriented Programming (OOP)**
    *   Revolves around **Objects**.
    *   `Code + Data = Object`
    *   Designed for easier development, debugging, reuse, and maintenance.
    *   **Hierarchy:** `Class` $\rightarrow$ `Object`

---

## 🧠 Language Types & Memory

### ⚡ Static vs. Dynamic Languages
| Feature | Static Language | Dynamic Language |
| :--- | :--- | :--- |
| **Type Checking** | Done at **Compile Time** | Done at **Runtime** |
| **Workflow** | Source $\rightarrow$ Compiler $\rightarrow$ Binary | Source $\rightarrow$ Compiler $\rightarrow$ Runtime |
| **Error Detection** | Errors show at compile time | Errors might only show during execution |
| **Declaration** | Datatypes must be declared (`int a = 10`) | No need to declare (`a = 10`) |
| **Control** | More control over the program | Saves writing time |

### 💾 Memory Management
*   **Stack Memory:** Stores reference variables.
*   **Heap Memory:** Stores the actual object.

**Example:** `a = 10`
`[a]` (Stack) $\longrightarrow$ `[10]` (Heap)

**Reference Logic:**
*   `a = 10`, `b = a` $\rightarrow$ Both `a` and `b` point to the same object `[10]`.
*   If any reference changes the object, it changes for all.
*   **Garbage Collector:** If `a = 50`, the old object `[10]` has no reference and is removed by the Garbage Collector.

---

## 📐 Program Flow & Logic

### 📊 Flowchart Symbols
*   **Oval:** Start / Stop
*   **Parallelogram:** Input / Output
*   **Rectangle:** Processing (Addition, subtraction, etc.)
*   **Diamond:** Condition (Decision making)
*   **Arrow / Line:** Flow Direction

**Example Logic:** `Take name` $\rightarrow$ `Output: Hello Name!`
`Start` $\rightarrow$ `Input Name` $\rightarrow$ `Output: Hello Name!` $\rightarrow$ `Stop`

### 📝 Pseudo Code
Human-readable steps, not machine-executable code.
**Example:**
1. Start
2. Take input: `name = input("Enter name")`
3. Output: `Hello name`
4. Stop

---

## ☕ Java Architecture

### ⚙️ Execution Flow
`.java file` (Human readable) $\rightarrow$ **Compiler** $\rightarrow$ `.class file` (Byte Code) $\rightarrow$ **JVM** (Interpreter) $\rightarrow$ **Machine Code** (0's & 1's)

> **PLATFORM INDEPENDENCE:** Byte code can run on any OS. Therefore, Java is platform-independent. However, the **JVM is platform-dependent** (built specifically for each OS).

### 🏗 JDK vs JRE vs JVM vs JIT
*   **JDK (Java Development Kit):** Full environment to develop and run programs. Contains development tools.
*   **JRE (Java Runtime Environment):** Environment to **only run** programs.
*   **JVM (Java Virtual Machine):** Executes byte code.
*   **JIT (Just In Time):** Part of JVM. For repeated methods, it provides direct machine code to avoid re-interpretation, making execution faster.

**Inside JVM:**
*   **Interpreter:** Line-by-line execution.
*   **Garbage Collector:** Removes unused objects from heap.
*   **Class Loader:** 
    1. *Loading:* Reads `.class` file, creates object in heap.
    2. *Linking:* Verifies file, allocates memory, replaces symbolic references.
    3. *Initialization:* Assigns static variables.

---

## 💻 Java Basics & Syntax

### 🚀 First Program
```java
public class Demo {
    public static void main(String args[]) {
        System.out.println(args[0]);
    }
}
```
*   `public`: Class can be accessed from anywhere.
*   `void`: Method returns no value.
*   `String[] args`: Array of characters passed to the main function.
*   **Compilation Tip:** Use `javac -d <path> Demo.java` to change output location.

**Rules:**
*   Class name and file name should be the same. (If different, the class must not be `public`).
*   **Packages:** Used for organization (e.g., `package com.abc`).

### 📥 Input & Output
*   `System.out.println()`: Prints and adds a new line.
*   `System.out.print()`: Prints without a new line.
*   **Scanner:** `Scanner sc = new Scanner(System.in);` used for keyboard input.

### 🔢 Datatypes & Literals
**Primitive Types:**
*   `int` (4 bytes)
*   `char` (Single quotes `'R'`)
*   `float` (4 bytes, requires `f` suffix: `7.2f`)
*   `double` (8 bytes, default for decimals)
*   `long` (8 bytes, requires `L` suffix: `1234L`)
*   `boolean` (`true`/`false`)

**Other Concepts:**
*   **Wrapper Class:** `Integer` (converts primitive to object).
*   **Literal:** Syntactic representation of data (e.g., `10` is an integer literal).
*   **Identifier:** Names of variables, methods, classes.
*   **Underscores:** `234_000_000` is treated as `234000000`.

### 🔄 Type Casting & Conversion
1.  **Widening (Automatic):** Smaller $\rightarrow$ Bigger.
    `byte` $\rightarrow$ `short` $\rightarrow$ `int` $\rightarrow$ `long` $\rightarrow$ `float` $\rightarrow$ `double`
2.  **Narrowing (Explicit):** Bigger $\rightarrow$ Smaller.
    Requires casting: `int i = (int) l;`
3.  **Automatic Promotion:** In expressions, `byte`, `short`, `char` are promoted to `int`. If `long`, `float`, or `double` is present, the whole expression is promoted to that type.

---

## ⚙️ Control Flow & Loops

### 🛣 Logic Structures
*   **If-Else:** Standard conditional branching.
*   **For Loop:** `for (statement1; statement2; statement3) { ... }`
*   **Switch Statement:**
    *   `default` executes if no cases match.
    *   `break` prevents "fall-through" to the next case.
    *   **New Syntax:** `case one -> // do this`
*   **Comparison:**
    *   `x.equals("word")`: Checks **value**.
    *   `x == "word"`: Checks **reference**.

---

## 🛠 Functions & Methods

### 📝 Structure
`access-modifier return-type method() { ... return statement; }`

**Key Concepts:**
*   **Pass By Value:** Java passes a copy of the value.
    *   *Primitives:* Original value remains unchanged outside the function.
    *   *Objects/Arrays:* The **value of the reference** is passed. Changing an array element inside a function **changes the original array**.
*   **Scopes:**
    *   *Function Scope:* Variables inside a method.
    *   *Block Scope:* Variables inside `{ }`.
    *   *Loop Scope:* Variables inside a loop.
*   **Shadowing:** Lower-level scope variable overrides higher-level scope variable of the same name.
*   **Varargs:** `static void fun(int... a)` allows a variable number of arguments (treated as an array).
*   **Overloading:** Multiple functions with the same name but **different arguments**. Decided at compile time.

---

## 📦 Arrays & ArrayLists

### 📏 Standard Arrays
*   **Definition:** Fixed-size collection of same-datatype elements.
*   **Syntax:** `int[] rollnos = new int[5];`
*   **Memory:** Reference in Stack, Object in Heap (Dynamic Memory Allocation).
*   **Default Values:** `int` $\rightarrow$ `0`, `String` $\rightarrow$ `null`.
*   **Mutability:** Arrays are **mutable**.

### 🗺 2D Arrays
*   **Syntax:** `int[][] arr = new int[rows][columns];`
*   **Concept:** Array of arrays. Column size is optional (**Jagged Array**).

### 🚀 ArrayList
*   **Package:** `java.util`
*   **Nature:** Dynamic array (size grows automatically).
*   **Note:** Uses Wrapper classes (doesn't support primitives directly).
*   **Internal Work:** When full, creates a new larger array and copies elements.

---

## 🔍 Searching Algorithms

### 1. Linear Search
*   Check elements one by one.
*   **Works on:** Unsorted arrays.
*   **Time Complexity:** Best $O(1)$, Worst $O(n)$.

### 2. Binary Search
*   **Precondition:** Array **must be sorted**.
*   **Logic:** Divide search space in half every step.
*   **Time Complexity:** Best $O(1)$, Worst $O(\log n)$.

### 3. Order Agnostic Binary Search
*   Used when the sort order (Ascending/Descending) is unknown.
*   **Logic:** Check if `start < end` (Asc) or `start > end` (Desc), then adjust target comparison.

---

## 🧹 Sorting Algorithms

### 🌀 Cyclic Sort
*   **Use Case:** Numbers in range $1$ to $N$.
*   **Logic:** Place every number at `index = value - 1`.
*   **Complexity:** $O(n)$.

### 🧼 Bubble Sort
*   **Logic:** Repeatedly swap adjacent elements. Largest "bubbles" to the end.
*   **Complexity:** Best $O(n)$, Worst $O(n^2)$.
*   **Type:** Stable, In-place.

### 📥 Insertion Sort
*   **Logic:** Build a sorted section on the left. Insert current element into its correct position on the left.
*   **Complexity:** Best $O(n)$, Worst $O(n^2)$.
*   **Type:** Stable, Adaptive.

### 🎯 Selection Sort
*   **Logic:** Select the maximum (or minimum) element and swap it to its correct position.
*   **Complexity:** Always $O(n^2)$.
*   **Type:** Unstable, In-place.

---

## 🧵 Strings & StringBuilder

### 🏗 Memory & String Pool
*   **String Pool:** Special area in Heap to store unique strings and save memory.
*   **Immutability:** Strings cannot be changed. Changing a string creates a **new object**.
*   **Comparison:**
    *   `==`: Compares references.
    *   `.equals()`: Compares content.

### ⚡ StringBuilder
*   **Mutable** version of String.
*   Faster for concatenations because it doesn't create new objects every time.

**Useful Methods:** `toCharArray()`, `length()`, `toLowerCase()`, `indexOf()`, `strip()`, `split()`.

---

## 💠 Pattern Problems

**Approach:**
1. **Rows:** Outer loop (Total lines).
2. **Cols:** Inner loop (Number of elements per row).
3. **Formula:** Find relationship between row index and column index.

**Distance Method (For Squares):**
`Value = min(left, right, top, bottom)` where:
`left = col`, `right = N - col`, `top = row`, `bottom = N - row`.

---

## 🔄 Recursion: The Fundamentals

**What is Recursion?** A function calling itself until a **Base Condition** is met.

### ⚠️ Critical Concepts
*   **Base Condition:** The stop signal. Without it $\rightarrow$ **Stack Overflow Error**.
*   **Call Stack:** Every call is pushed onto the stack. LIFO (Last In First Out).
*   **Recursion vs Iteration:** Recursion is cleaner but uses more stack memory.

### 📈 Space Complexity in Recursion
> **GOLDEN RULE:** Space Complexity = Height of the Recursion Tree.
*   It depends on the **maximum depth** of the recursion, not the total number of calls.

---

## 🛠 Recursion: Practical Applications

### 🔢 Basic Problems
*   **Print N to 1:** Work $\rightarrow$ Call.
*   **Print 1 to N:** Call $\rightarrow$ Work.
*   **Factorial:** `fact(n) = n * fact(n-1)`.
*   **Sum of Digits:** `sum(n) = (n % 10) + sum(n / 10)`.

### 📦 Arrays & Strings with Recursion
*   **Sorted Check:** Compare `arr[i]` and `arr[i+1]`.
*   **Linear Search:** Compare `arr[index]` with target.
*   **Remove Character:** If `ch == 'a'`, skip; else add to answer.
*   **Subsets:** For every element $\rightarrow$ **Include** or **Exclude**. (Total $2^n$ subsets).

### 🎲 Advanced Combinations
*   **Phone Keypad:** Generate all character combinations for a digit string.
*   **Dice Throw:** Find all paths to reach a target sum using faces 1-6.
*   **Permutations:** Arrange characters in all possible orders. (Total $n!$ permutations).

---

## 🚀 Advanced Sorting (Divide & Conquer)

### 🧩 Merge Sort
*   **Logic:** Divide array into halves $\rightarrow$ Sort recursively $\rightarrow$ Merge sorted halves.
*   **Time Complexity:** Always $O(n \log n)$.
*   **Space Complexity:** $O(n)$ (Not in-place).
*   **Type:** Stable.

### ⚡ Quick Sort
*   **Logic:** Pick a **Pivot** $\rightarrow$ Partition array (smaller to left, larger to right) $\rightarrow$ Sort recursively.
*   **Time Complexity:** Best/Avg $O(n \log n)$, Worst $O(n^2)$.
*   **Space Complexity:** $O(\log n)$.
*   **Type:** Unstable, In-place.

**Tim Sort:** Hybrid of Merge Sort + Insertion Sort (used in Java/Python).

---

## 📉 Recursion: Advanced Math & Recurrences

### 📐 Recurrence Relations
**General Form:** $T(n) = aT(n/b) + g(n)$
*   $g(n)$: Extra work done outside recursive calls.

### 🧮 Solving Linear Recurrences (Homogeneous)
1. Assume $f(n) = \alpha^n$.
2. Create the **Characteristic Equation**.
3. Find roots ($\alpha$).
4. **General Solution:**
    *   Distinct roots: $f(n) = C_1\alpha_1^n + C_2\alpha_2^n$.
    *   Repeated roots: $f(n) = C_1\alpha^n + C_2n\alpha^n$.

**Fibonacci Example (Binet's Formula):**
$f(n) = \frac{1}{\sqrt{5}} [(\frac{1+\sqrt{5}}{2})^n - (\frac{1-\sqrt{5}}{2})^n]$
Time Complexity: $O(1.618^n)$ (Exponential $\rightarrow$ Slow).

### ⚡ Non-Homogeneous Recurrence
Form: $f(n) = af(n-1) + g(n)$ where $g(n) \neq 0$.
**Solution:** `Homogeneous Solution` + `Particular Solution (guessed based on g(n))`.

***
**💡 Study Tip:** Trust the recursion, draw the tree, and always identify your base case first!

# 🚀 LeetCode Problems by Topic

> **Purpose:** Connect each DSA concept from your notes to a relevant LeetCode problem for hands-on practice.

---

## 📊 Quick Reference Table

| Topic from Notes | LeetCode Problem | Problem # | Why It Fits |
|-----------------|------------------|-----------|-------------|
| **Arrays & ArrayLists** | Two Sum | [1](https://leetcode.com/problems/two-sum/) | Classic array traversal + HashMap for O(n) solution |
| **Binary Search** | Binary Search | [704](https://leetcode.com/problems/binary-search/) | Direct application of binary search on sorted array |
| **Order Agnostic Binary Search** | Search in Rotated Sorted Array | [33](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Must detect sort order (asc/desc) before searching |
| **Cyclic Sort** | Find the Duplicate Number | [287](https://leetcode.com/problems/find-the-duplicate-number/) | Numbers 1..n, uses `index = value - 1` placement |
| **Bubble Sort** | Sort an Array | [912](https://leetcode.com/problems/sort-an-array/) | Can implement bubble sort (though O(n²) may time out) |
| **Insertion Sort** | Sort an Array | [912](https://leetcode.com/problems/sort-an-array/) | Insertion sort implementation (O(n²)) |
| **Selection Sort** | Sort an Array | [912](https://leetcode.com/problems/sort-an-array/) | Selection sort implementation (O(n²)) |
| **Merge Sort** | Sort an Array | [912](https://leetcode.com/problems/sort-an-array/) | Merge sort implementation (O(n log n)) |
| **Quick Sort** | Sort an Array | [912](https://leetcode.com/problems/sort-an-array/) | Quick sort implementation (O(n log n) avg) |
| **Recursion (Basics)** | Fibonacci Number | [509](https://leetcode.com/problems/fibonacci-number/) | Direct recursive definition with base cases |
| **Recursion on Arrays** | Binary Search (Recursive) | [704](https://leetcode.com/problems/binary-search/) | Implement recursive binary search |
| **Recursion (Subsets)** | Subsets | [78](https://leetcode.com/problems/subsets/) | Generate all subsets using include/exclude pattern |
| **Recursion (Permutations)** | Permutations | [46](https://leetcode.com/problems/permutations/) | Generate all permutations via backtracking |
| **Recursion (Phone Keypad)** | Letter Combinations of a Phone Number | [17](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | Recursive combination generation from digit→letters |
| **Recursion (Dice/Combinations)** | Dice Throw (Custom) | N/A | Generate all ways to reach target sum with dice faces 1-6 |
| **Strings** | Valid Anagram | [242](https://leetcode.com/problems/valid-anagram/) | Check if two strings are anagrams (character frequency) |
| **StringBuilder** | Longest Substring Without Repeating Characters | [3](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Sliding window with StringBuilder-like operations |
| **Pattern Problems** | Spiral Matrix | [54](https://leetcode.com/problems/spiral-matrix/) | Matrix traversal in spiral pattern (row/col logic) |
| **Two Pointers** | Two Sum II - Input array is sorted | [167](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | Two-pointer technique on sorted array |
| **Recursion (Divide & Conquer)** | Pow(x, n) | [50](https://leetcode.com/problems/powx-n/) | Efficient exponentiation via divide & conquer |
| **Recursion (Climbing Stairs)** | Climbing Stairs | [70](https://leetcode.com/problems/climbing-stairs/) | Fibonacci-like recurrence: `ways(n) = ways(n-1) + ways(n-2)` |
| **Cyclic Sort (Advanced)** | First Missing Positive | [41](https://leetcode.com/problems/first-missing-positive/) | Place numbers 1..n at correct indices, find first missing |
| **Recursion (Backtracking)** | Generate Parentheses | [22](https://leetcode.com/problems/generate-parentheses/) | Backtracking with open/close count constraints |
| **Recursion (Tree Traversal)** | Maximum Depth of Binary Tree | [104](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Recursive tree traversal (DFS) |
| **ArrayList Dynamic** | Merge Sorted Array | [88](https://leetcode.com/problems/merge-sorted-array/) | Merge two sorted arrays (ArrayList-like dynamic sizing) |

---

## 🔍 Detailed Examples for Key Topics

### 1. **Arrays & ArrayLists → Two Sum (LeetCode 1)**
```java
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    return new int[] {};
}
```
**Why:** Demonstrates array traversal, HashMap usage (dynamic collection), and O(n) time complexity.

---

### 2. **Binary Search → Binary Search (LeetCode 704)**
```java
public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```
**Why:** Classic binary search—divide search space in half each step (O(log n)).

---

### 3. **Cyclic Sort → Find the Duplicate Number (LeetCode 287)**
```java
public int findDuplicate(int[] nums) {
    int i = 0;
    while (i < nums.length) {
        int correct = nums[i] - 1;
        if (nums[i] != nums[correct]) {
            swap(nums, i, correct);
        } else {
            i++;
        }
    }
    for (i = 0; i < nums.length; i++) {
        if (nums[i] != i + 1) {
            return nums[i];
        }
    }
    return -1;
}

void swap(int[] nums, int first, int second) {
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
}
```
**Why:** Numbers are in range 1..n. Cyclic sort places each number at `index = value - 1`. Duplicate will be at wrong index.

---

### 4. **Recursion (Subsets) → Subsets (LeetCode 78)**
```java
public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, new ArrayList<>(), nums, 0);
    return result;
}

void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
    result.add(new ArrayList<>(temp));
    for (int i = start; i < nums.length; i++) {
        temp.add(nums[i]);
        backtrack(result, temp, nums, i + 1);
        temp.remove(temp.size() - 1);
    }
}
```
**Why:** Each element has **include/exclude** choice. Recursive tree builds all 2ⁿ subsets.

---

### 5. **Recursion (Permutations) → Permutations (LeetCode 46)**
```java
public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, new ArrayList<>(), nums);
    return result;
}

void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
    if (temp.size() == nums.length) {
        result.add(new ArrayList<>(temp));
        return;
    }
    for (int i = 0; i < nums.length; i++) {
        if (temp.contains(nums[i])) continue;
        temp.add(nums[i]);
        backtrack(result, temp, nums);
        temp.remove(temp.size() - 1);
    }
}
```
**Why:** For each position, try every unused number (n! permutations). Backtracking restores state.

---

### 6. **Pattern Problems → Spiral Matrix (LeetCode 54)**
```java
public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix.length == 0) return result;
    
    int rowStart = 0, rowEnd = matrix.length - 1;
    int colStart = 0, colEnd = matrix[0].length - 1;
    
    while (rowStart <= rowEnd && colStart <= colEnd) {
        // Traverse Right
        for (int col = colStart; col <= colEnd; col++) {
            result.add(matrix[rowStart][col]);
        }
        rowStart++;
        
        // Traverse Down
        for (int row = rowStart; row <= rowEnd; row++) {
            result.add(matrix[row][colEnd]);
        }
        colEnd--;
        
        // Traverse Left
        if (rowStart <= rowEnd) {
            for (int col = colEnd; col >= colStart; col--) {
                result.add(matrix[rowEnd][col]);
            }
            rowEnd--;
        }
        
        // Traverse Up
        if (colStart <= colEnd) {
            for (int row = rowEnd; row >= rowStart; row--) {
                result.add(matrix[row][colStart]);
            }
            colStart++;
        }
    }
    return result;
}
```
**Why:** Simulates spiral pattern using boundary variables (`rowStart`, `rowEnd`, `colStart`, `colEnd`).

---

### 7. **Recursion (Divide & Conquer) → Pow(x, n) (LeetCode 50)**
```java
public double myPow(double x, int n) {
    if (n == 0) return 1;
    if (n < 0) {
        x = 1 / x;
        n = -n;
    }
    return fastPow(x, n);
}

double fastPow(double x, int n) {
    if (n == 0) return 1.0;
    double half = fastPow(x, n / 2);
    if (n % 2 == 0) {
        return half * half;
    } else {
        return half * half * x;
    }
}
```
**Why:** Divide problem size by 2 each recursion (T(n) = T(n/2) + O(1)). O(log n) time.

---

### 8. **Strings → Valid Anagram (LeetCode 242)**
```java
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }
    for (int c : count) {
        if (c != 0) return false;
    }
    return true;
}
```
**Why:** String character frequency counting. Uses array as frequency map (like ArrayList but fixed size).

---

## 🎯 How to Use This Mapping

1. **Identify the concept** you're studying from your notes.
2. **Go to the corresponding LeetCode problem** using the table.
3. **Attempt the problem yourself** before looking at solutions.
4. **Compare your approach** with the pattern/algorithm from your notes.
5. **Practice multiple problems** per topic to reinforce.

---

## 💡 Pro Tips for LeetCode Practice

- **Start with Easy:** Master basic implementations before moving to Hard.
- **Pattern Recognition:** Many problems fit into 1-2 core patterns (e.g., "Two Sum" → HashMap, "Subsets" → Backtracking).
- **Time Yourself:** Simulate interview conditions (20-30 mins per problem).
- **Review Solutions:** After solving, read top discussion solutions to learn optimizations.
- **Track Progress:** Use LeetCode's "Study Plans" or create your own topic-wise checklist.

---

> **Remember:** Your notes provide the *theory*; LeetCode provides the *practice*. Together, they build true mastery! 🔥

**Next Step:** Pick one topic from your notes, solve its corresponding LeetCode problem, and repeat! 🚀