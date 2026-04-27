

# 📦 Design Patterns - Exercises

This repository contains the implementation of different exercises focused on the use of **design patterns** and the application of SOLID principles in Java.

Each level is organized independently to make the code easier to understand, maintain, and scale.

---

## 🧱 Project Structure

```
src
 ├── main
 │    └── java
 │         ├── level1
 │
 └── test
      └── java
           ├── level1
```

Each level contains its own logic and corresponding unit tests.

---

# 🥇 Level 1 - Singleton Pattern

## 📌 Description

In this level, the **Singleton design pattern** is implemented, which ensures that a class has only one instance and provides a global access point to it.

An `Undo` class has been developed to simulate the basic behavior of a command history system.

---

## ⚙️ Functionality

The `Undo` class allows you to:

- Add commands to the history
- Undo the last command
- Display the full command history

---

## 🧠 Design

The following concepts have been applied:

- **Singleton**:
  - Private constructor
  - Single instance accessed through `getInstance()`
- **Encapsulation**:
  - The command list is not directly accessible from outside the class
- **Error handling**:
  - Exceptions are thrown when trying to operate on an empty history

---

## 🧪 Tests

Unit tests have been implemented to verify:

- That the instance is unique (Singleton)
- The correct behavior of `addCommand` and `undoCommand`
- Exception handling in edge cases (empty history)

---

# 🚀 Technologies Used

- Java
- JUnit 5
- Maven

---

# 🎯 Objective

The goal of this project is to learn how to:

- Apply design patterns in real scenarios
- Write clean, maintainable, and scalable code
- Implement unit tests to validate system behavior