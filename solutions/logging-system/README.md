# 🧪 Activity: Centralized Logging System - Solution

## 🎯 Objective

This solution demonstrates how to design a **centralized logging system** using the **Singleton Pattern in Java**.

The main goal is to ensure that:

* Only **one Logger instance** exists in the entire application
* All services share the same logging mechanism
* Logging is **consistent, centralized, and controlled**

This avoids duplication, inconsistent logs, and multiple logging outputs across the system.

---

## 🧠 Solution Explanation

### Step 1: Identified Main Components

* `Logger` (Singleton)
* `OrderService`
* `PaymentService`
* `UserService`
* `Main`

---

### Step 2: Identified the Core Problem

Each service originally created its own logging component, which caused:

* Duplicate log outputs
* Inconsistent logging formats
* Multiple logger instances in memory
* Difficult debugging and monitoring

### 💡 Key Insight

The logging system is a **shared resource**, so it must be centralized and globally accessible through a single instance.

---

### Step 3: Designed the Singleton Logger

The `Logger` class is responsible for:

* Ensuring only **one instance** exists
* Providing a global access point via `getInstance()`
* Handling all logging operations
* Supporting multiple log levels:

  * INFO
  * ERROR
  * DEBUG

#### Singleton Structure

* `private static Logger instance` → holds the single object
* `private constructor()` → prevents external instantiation
* `public static getInstance()` → controls object creation

---

### Step 4: Logging Responsibilities

The `Logger` provides:

* `logInfo(String message)` → general system events
* `logError(String message)` → error tracking
* `logDebug(String message)` → development/debugging details

Each log includes a timestamp for better traceability.

---

### Step 5: Service Integration

Each service:

* Uses `Logger.getInstance()` instead of creating new objects
* Shares the same Logger instance
* Produces consistent system-wide logs

#### Services Behavior

* `OrderService` → logs order-related events
* `PaymentService` → logs payment processing events
* `UserService` → logs user registration events

---

## Step 6: UML Diagram Representation

```text
+--------------------------------------------------+
|                     Logger                       |
+--------------------------------------------------+
| - instance: Logger                               |
| - Logger()                                       |
+--------------------------------------------------+
| +getInstance(): Logger                           |
| +logInfo(message: String): void                  |
| +logError(message: String): void                 |
| +logDebug(message: String): void                 |
+--------------------------------------------------+
                       ▲
                       |
        --------------------------------
        |              |               |
+----------------+ +----------------+ +----------------+
|  OrderService  | | PaymentService | |  UserService   |
+----------------+ +----------------+ +----------------+
| +placeOrder()  | | +processPayment| | +registerUser()|
+----------------+ +----------------+ +----------------+
        \              |               /
         \             |              /
          \------------|-------------/
                       |
                uses Logger Singleton
```

---

## Step 7: Java Implementation Highlights

* `Logger` is the **single source of truth for logging**
* All services depend on `Logger.getInstance()`
* No service is allowed to create its own Logger
* Ensures **global consistency across the system**
* Uses **lazy initialization** (instance created only when needed)

---

## 🧾 Example Execution Flow

```java
OrderService orderService = new OrderService();
PaymentService paymentService = new PaymentService();
UserService userService = new UserService();

orderService.placeOrder();
paymentService.processPayment();
userService.registerUser();
```

---

## 📌 Example Console Output

```text
Logger initialized...

[INFO] 2026-05-25T16:10:12 - Order placed successfully
[DEBUG] 2026-05-25T16:10:12 - OrderService: order flow executed

[INFO] 2026-05-25T16:10:13 - Payment processed successfully
[DEBUG] 2026-05-25T16:10:13 - PaymentService: payment flow executed

[INFO] 2026-05-25T16:10:13 - User registered successfully
[DEBUG] 2026-05-25T16:10:13 - UserService: registration flow executed

Same Logger instance? true
```

---

## ✅ Key Concepts Demonstrated

* Singleton Design Pattern
* Lazy Initialization
* Encapsulation of shared resources
* Global state management
* Separation of concerns
* Centralized system design
* Dependency sharing across services

---

## 🚀 Advantages of This Design

* Prevents multiple logger instances
* Ensures consistent logging format across system
* Reduces memory overhead
* Centralizes debugging and monitoring
* Simplifies maintenance
* Provides a single point of control

---

## 📌 Key Insight

This activity demonstrates how the **Singleton Pattern** ensures controlled access to shared resources like logging systems.

By enforcing a single global instance, the system achieves:

* Consistency
* Efficiency
* Simplicity
* Maintainability

This pattern is widely used in real-world backend systems for logging, caching, configuration management, and connection pooling.
