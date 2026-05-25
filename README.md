# 🧩 Design Patterns Lab — Singleton Pattern

![Java](https://img.shields.io/badge/Language-Java-blue)
![Pattern](https://img.shields.io/badge/Pattern-Singleton-green)
![Level](https://img.shields.io/badge/Level-Beginner-orange)
![Focus](https://img.shields.io/badge/Focus-Shared%20State%20%26%20Object%20Control-purple)

---

## 🎥 Lecture Video

This repository accompanies the lecture explaining the **Singleton Pattern** through a **real backend scenario, design problems, and step-by-step thinking process**.

▶️ Watch on YouTube:  

[Lecture Video](https://youtu.be/TJU2rCkHaMM)

---

## 📌 About This Repository

This repository provides a **deep and structured understanding of the Singleton Pattern**.

The focus is not only on *what Singleton is*, but on:

- Understanding the **real problem behind shared resources**
- Recognizing **bad design decisions in real systems**
- Learning **why duplication and inconsistency happen**
- Applying Singleton to ensure **system-wide consistency**
- Understanding the **limitations and trade-offs** of this pattern

---

## 🧠 What is Singleton (Real Meaning)

Most beginners think Singleton means:

> “Only one object exists”

This is not wrong, but it is not the real idea.

### ✅ The Real Meaning

Singleton ensures:

> The entire system uses **one shared instance of a resource**

The most important word is:

> **Shared**

---

## ⚠️ The Real Problem (From Backend Systems)

In real applications:

- Multiple services need access to the same data  
- This data is often expensive to load  
- The system must behave consistently  

### ❌ What Goes Wrong Without Control

If every part of the system creates its own copy:

- Memory is wasted due to duplication  
- Expensive operations are repeated  
- Different parts of the system see different values  
- Bugs appear due to inconsistent state  

---

## 💡 Running Scenario — Shared System Decisions

### 🎯 Scenario

You are building a backend system with multiple services such as:

- CheckoutService  
- SearchService  
- ProfileService  

All of them need to make decisions that affect behavior across the system.

These decisions are:

- Shared across all services  
- Controlled from a central source  
- Expected to be consistent everywhere  

---

## ❌ Initial Design Problem

Each service creates its own internal object to access these decisions.

### What Goes Wrong?

- Each service loads the same data independently  
- The same resource is duplicated across the system  
- Creation logic is repeated in multiple places  
- Responsibilities are mixed (creation + usage)  

---

## ⚠️ Why This Design Fails

### 1) Repeated Expensive Work
The same data is loaded multiple times unnecessarily.

### 2) Memory Duplication
Multiple copies of the same data exist in memory.

### 3) Inconsistent State
Different services may operate on different versions of the same data.  
This leads to real-world bugs and unpredictable behavior.

### 4) Poor Separation of Concerns
Classes are responsible for both:
- Creating the object  
- Using the object  

---

## 💡 Key Insight

> The problem is not object creation itself  
> The problem is creating **multiple copies of a shared resource**

---

## ✅ Singleton — Core Idea

Singleton solves this by:

- Ensuring only one instance exists  
- Providing a single access point  
- Making all parts of the system use the same object  

---

## 🔍 Understanding the Design

A correct Singleton design ensures:

- The object cannot be created freely  
- There is a controlled way to access it  
- The same instance is reused everywhere  

---

## ⚙️ How the System Uses Singleton

Instead of creating new objects, services:

- Request the shared instance  
- Use it without worrying about creation  

### Result

- One shared object across the system  
- No duplication  
- Consistent behavior  

---

## 🔄 Data Source Concept (Important)

The shared resource usually depends on data that comes from outside the system.

Examples include:

- Remote APIs  
- Databases  
- Configuration files  

### Key Idea

> The data is external and must be loaded once and shared  

---

## ➕ Managing System Data

### Adding New Data
- Add it to the central source  
- All parts of the system automatically see it  

### Removing Data
- Remove it from the source  
- The system continues working safely using default behavior  

---

## 🧪 Verifying the Design

A correct Singleton ensures:

- All parts of the system reference the same object  
- No duplicate instances exist  
- Behavior is consistent across all services  

---

## ⚖️ What Singleton Solves

Singleton is useful when:

### 1) Expensive Object Creation
- Loading configuration  
- Fetching remote data  

### 2) Shared System State
- Caches  
- Configuration  
- Logging systems  

### 3) Consistency Requirement
- All parts of the system must agree on the same data  

---

## ⚠️ The Hidden Problem (Very Important)

Singleton introduces a new issue:

### ❌ Tight Coupling

Classes directly depend on a specific implementation.

This means:

- Dependencies are not flexible  
- Replacing the implementation becomes difficult  

---

## 🧪 Why Testing Becomes Hard

Because the object is globally controlled:

- It cannot be easily replaced  
- Fake or mock versions are difficult to use  
- Testing becomes more complex  

---

## 🔗 Connection to Dependency Injection (DI)

### Key Difference

- Singleton controls **how many instances exist**  
- Dependency Injection controls **who provides the instance**  

### Insight

> Singleton solves one problem but introduces another  
> Dependency Injection is used to restore flexibility  

---

## 🧠 Design Evolution Insight

1. Problem: Multiple duplicated instances  
2. Solution: Singleton (shared instance)  
3. New Problem: Tight coupling  
4. Next Step: Dependency Injection  

---

## ⚖️ When to Use Singleton

Use Singleton when:

- A resource must be shared across the system  
- Object creation is expensive  
- Consistency is required  

---

## 🚫 When NOT to Use It

Avoid Singleton when:

- Multiple instances are valid  
- The object is not shared  
- Flexibility and testing are priorities  

---

## 🧠 Best Practices

- Use Singleton only when necessary  
- Avoid overusing it  
- Be aware of tight coupling  
- Combine with Dependency Injection in real systems  
- Keep responsibilities clear and focused  

---

## 💾 Solutions

📁 [`solutions/`](solutions/)

All activity solutions are available inside the `/solutions` folder.

Each solution includes:

* UML diagrams and design explanation
* Clean and well-structured Java implementation
* Notes about relationships and design decisions
* Singleton Pattern workflow explanation
* Centralized logging system behavior analysis
* Example usage through `Main.java`

---

### Included Solutions

* 🧾 Centralized Logging System

---

> Students are encouraged to complete the activities independently first, then use the provided solutions to compare implementations, understand design decisions, and explore alternative approaches.

---

## 🎯 Learning Outcomes

After completing this repository, you should be able to:

- Identify when Singleton is needed  
- Detect poor shared resource design  
- Understand the trade-offs of Singleton  
- Apply Singleton in real backend scenarios  
- Recognize when to move toward Dependency Injection  

---

## 🚀 How to Use This Repository

1. Clone the repository  
2. Study the problem and scenario  
3. Understand the design issues  
4. Review the provided examples  
5. Solve the activity independently  
6. Refactor and improve your solution  

---

## 📌 Final Insight

Singleton is not about limiting objects.

It is about:

- Controlling shared resources  
- Ensuring system consistency  
- Avoiding duplication  

A well-designed system ensures:

> One shared source of truth across the entire application
