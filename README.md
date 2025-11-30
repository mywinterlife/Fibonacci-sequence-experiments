# Fibonacci Sequence Experiments

A small Java project exploring different approaches to generating and analyzing the Fibonacci sequence.  
Built using the **Java Project Template** for clean structure, clarity, and ease of expansion.

---

## Project Purpose

This repository serves as a sandbox for learning, experimenting, and comparing:

- Iterative vs. recursive Fibonacci generation  
- Performance differences between approaches  
- Memoization techniques  
- Edge-case handling  
- Printing sequences and exploring patterns  

It’s designed to help reinforce core Java fundamentals (loops, conditionals, methods, classes) while creating a reusable project structure that will support future algorithm-based explorations.

---

## Project Structure (Template Overview)

This project uses a reusable **Java Project Template**, which provides a clean, standardized layout:

```text
Fibonacci-sequence-experiments/
  ├─ src/
  │  ├─ main/
  │  │  └─ java/
  │  │     └─ <package>/
  │  │        ├─ Main.java
  │  │        └─ FibonacciService.java   (or similar logic classes)
  │  └─ test/
  │     └─ java/
  │        └─ <package>/                 (future JUnit tests)
  ├─ .gitignore
  ├─ README.md
  └─ pom.xml or build.gradle (if/when added)

---

**The template provides:**
Consistent folder layout
Simple entry point (Main)
Separation of concerns for logic classes
Space for future unit tests
Ready for IntelliJ import without configuration issues

Features (Current & Planned)
Current
Generate the Fibonacci sequence up to N
Basic iterative approach
Basic recursive approach
Printing sequence to console

Upcoming Enhancements
Memoized/DP version
Performance comparison output
Input validation
Command-line arguments
Export sequence to file
JUnit tests using the template’s /test structure

How to Run
You can run the project directly in IntelliJ:
Clone the repository
Open the folder in IntelliJ using Open
Ensure JDK 17 (Temurin) is selected
Run Main.java

Learning Objectives
This project is part of an ongoing study path focusing on:
Java fundamentals (methods, loops, classes)
Algorithmic thinking
Clean coding habits
Using IntelliJ efficiently
Managing projects using GitHub templates
Preparing for automation and SDET roles

Contributing (Future)

This repo is primarily for personal learning, but suggestions or improvements are welcome via Issues or Pull Requests.

License

MIT License — see LICENSE for details.

---

**Example(s):**

**Iterative Implementation (Example)**
public long fibIterative(int n) {
    if (n < 0) throw new IllegalArgumentException("n must be non-negative");
    if (n == 0) return 0;
    if (n == 1) return 1;

    long prev = 0;
    long curr = 1;

    for (int i = 2; i <= n; i++) {
        long next = prev + curr;
        prev = curr;
        curr = next;
    }

    return curr;
}

---

**Recursive Implementation (Example)**
public long fibRecursive(int n) {
    if (n < 0) throw new IllegalArgumentException("n must be non-negative");
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibRecursive(n - 1) + fibRecursive(n - 2);
}

---

**Memoized Implementation (Example Sketch)**
private final Map<Integer, Long> cache = new HashMap<>();

public long fibMemoized(int n) {
    if (n < 0) throw new IllegalArgumentException("n must be non-negative");
    if (n == 0) return 0;
    if (n == 1) return 1;

    if (cache.containsKey(n)) {
        return cache.get(n);
    }

    long value = fibMemoized(n - 1) + fibMemoized(n - 2);
    cache.put(n, value);
    return value;
}

---

Recursion vs Iteration — Comparison Table
| Aspect                 | Iterative Approach                 | Recursive Approach                               |
| ---------------------- | ---------------------------------- | ------------------------------------------------ |
| Conceptual simplicity  | Straightforward loop               | Very close to the mathematical definition        |
| Performance (time)     | O(n)                               | O(2ⁿ) without memoization                        |
| Performance (space)    | O(1) additional space              | O(n) stack depth                                 |
| Risk of stack overflow | None (for reasonable `n`)          | Possible for large `n`                           |
| Ease of debugging      | Easy to step through in a loop     | Requires understanding recursive call stack      |
| Code length            | Usually slightly longer            | Often shorter and more “elegant”                 |
| When to use            | When performance and safety matter | When clarity or teaching the concept is the goal |







Run Main.java
