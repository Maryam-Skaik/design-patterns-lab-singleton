# 🧩 Activity: Centralized Logging System (Singleton Pattern)

## 🎯 Objective

Apply everything learned in this lab:

- Understand the **real purpose of Singleton**
- Identify **shared resources in a system**
- Prevent **duplication and inconsistency**
- Design a system with **one shared instance**

---

## 📌 Scenario

You are building a backend system that includes multiple services:

- OrderService  
- PaymentService  
- UserService  

All of these services need to:

- Record system logs  
- Track important events  
- Monitor errors  

---

## ❌ Current Problem

Each service creates its own logging component.

This leads to:

- Multiple log outputs  
- Duplicate log messages  
- Inconsistent logging behavior across the system  

---

## 🧠 Your Task

### Step 1: Identify the Problem

Think carefully:

- What is the shared resource in this system?  
- Why is having multiple instances a problem?  

---

### Step 2: Design the Solution

- Create a **Logger** component  
- Ensure that:
  - Only **one instance** exists in the system  
  - All services use the same instance  

---

### Step 3: Define Responsibilities

Your Logger should:

- Handle all logging operations  
- Provide a simple method like:
  - logging messages  
- Be accessible from all services  

---

### Step 4: Use the Logger in Services

- Update all services to use the shared Logger  
- Remove any direct creation of logging objects  
- Ensure consistent behavior across the system  

---

## 💡 Hints

- Think about **why logs must be centralized**  
- Ask yourself:
  - What happens if multiple loggers exist?  
- Focus on:
  - Controlling object creation  
  - Sharing the same instance everywhere  

---

## ✅ Expected Outcome

- A design where only **one Logger exists**  
- All services use the same logging component  
- No duplication or inconsistency in logs  
- Clean and maintainable structure  

---

## ⭐ Bonus (Optional)

- Add ability to:
  - Format log messages  
  - Add timestamps  
  - Support different log levels (INFO, ERROR, DEBUG)  

---

## 🧩 Challenge Extension (Optional)

- What happens if logging behavior needs to change later?  
- How flexible is your design?  
- Can your Logger be easily replaced or extended?  

Think about how this connects to **Dependency Injection**.
