# Kotlin Koans: Mastering Kotlin Through Hands-On Practice

[![official JetBrains project](https://jb.gg/badges/official-plastic.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)

Kotlin Koans is a series of interactive exercises designed to familiarize you with Kotlin's syntax and idiomatic features. Whether you are a seasoned Java developer transitioning to Kotlin or a newcomer to the JVM ecosystem, these Koans provide a "Fail-to-Pass" learning experience that solidifies your understanding through immediate feedback.

---

## 🚀 The Educational Philosophy: "Zero to Hero"

The repository is structured as a series of failing unit tests. Your mission is simple: **make them pass.**

- **Active Learning**: Instead of just reading documentation, you write code from the start.
- **Immediate Feedback**: Each task comes with its own set of tests that provide instant validation.
- **Idiomatic Focus**: The exercises don't just teach you how to write Kotlin; they teach you how to write *good* Kotlin.

---

## 🗺️ Curriculum Map

The course is divided into 7 core modules, covering everything from basic syntax to advanced DSL builders.

### 1. Introduction
Foundational concepts to get you started with Kotlin's unique syntax.
- **Hello, world!**: Basic function syntax.
- **Named & Default arguments**: Reducing overload boilerplate.
- **Triple-quoted & String templates**: Powerful string manipulation.
- **Nullable types**: The "Billion Dollar Mistake" fixed.
- **Nothing type**: Understanding functions that never return.
- **Lambdas**: Functional programming basics.

### 2. Classes
Understanding Kotlin's powerful object-oriented features.
- **Data classes**: Automatic `equals`, `hashCode`, and `toString`.
- **Smart casts**: Type checks that actually work for you.
- **Sealed classes**: Restricted class hierarchies for better `when` expressions.
- **Extension functions**: Adding functionality to existing classes without inheritance.
- **Rename on import**: Resolving name conflicts elegantly.

### 3. Conventions
Mastering operator overloading and other Kotlin conventions.
- **Comparison**: implementing the `Comparable` interface.
- **Ranges & For loops**: Customizing iteration logic.
- **Operators overloading**: Making your classes feel native.
- **Invoke convention**: Objects that can be called like functions.

### 4. Collections
Deep dive into the Kotlin Standard Library's collection operations.
- **Introduction**: Transforming Java collection patterns to Kotlin.
- **Filter & Map**: Basic transformations.
- **All, Any and other predicates**: Querying collections.
- **Associate, GroupBy, Partition**: Advanced grouping and mapping.
- **FlatMap**: Dealing with nested collections.
- **Max, Min, Sum, Fold**: Accumulation and reduction operations.
- **Sort**: Custom sorting logic.
- **Sequences**: Efficient lazy evaluation for large data sets.
- **Compound tasks**: Combining multiple operations to solve complex problems.
- **Getting used to new style**: Transitioning to idiomatic collection processing.

### 5. Properties
Exploring Kotlin's sophisticated property system.
- **Properties**: Getters, setters, and backing fields.
- **Lazy property**: Delaying initialization until necessary.
- **Delegates**: How properties can delegate their logic to other objects.
- **Common Delegates**: Exploring built-in delegates like `observable`.

### 6. Builders
Learning how to create type-safe builders and Domain Specific Languages (DSLs).
- **Function literals with receiver**: The magic behind Kotlin DSLs.
- **String and Map builders**: Practical examples of custom builders.
- **The `apply` function**: Object configuration made easy.
- **HTML builders**: Building complex tree structures with type safety.
- **Builders how it works & Implementation**: Deep dive into the mechanics.

### 7. Generics
Handling generic types and functions effectively.
- **Generic functions**: Writing reusable, type-safe code.

---

## 🛠️ Technical Stack & Architecture

### Technology Stack
- **Language**: Kotlin 1.5.10
- **Build System**: Gradle
- **Testing Framework**: JUnit 4
- **Target Platform**: JVM 1.8

### Repository Structure
Each exercise follows a strict organizational pattern compatible with the JetBrains EduTools ecosystem:
- `src/Task.kt`: The file where you implement your solution. Look for `TODO()` markers.
- `test/tests.kt`: The unit tests that verify your solution.
- `task.md`: The instruction manual for the specific exercise.
- `task-info.yaml`: Configuration file for the educational plugin.

The `util/` module contains shared testing utilities used across all Koans to provide helpful error messages and test runners.

---

## 🏁 Getting Started

### For Learners (Recommended)
There are two primary ways to solve these Koans without manually configuring the environment:
1.  **Online**: Play with Koans directly in your browser at [play.kotlinlang.org](https://play.kotlinlang.org/koans/overview).
2.  **IntelliJ IDEA / Android Studio**:
    - Install the [EduTools plugin](https://www.jetbrains.com/help/education/install-edutools-plugin.html).
    - Go to `File > Learn and Teach > Browse Courses`.
    - Select **Kotlin Koans**.

### For Contributors & Power Users
If you wish to contribute to the Koans or run them locally using Gradle:
1.  Clone the repository.
2.  Ensure you have JDK 8 or higher installed.
3.  Run all tests to verify the current state:
    ```bash
    ./gradlew test
    ```
4.  To work on a specific task, navigate to its directory and modify `src/Task.kt`.

---

## 💼 Business & Technical Impact

- **For Engineering Leads**: Kotlin Koans is an excellent tool for onboarding new developers. It ensures a baseline of idiomatic Kotlin knowledge across the team.
- **For Technical Educators**: The repository serves as a blueprint for creating interactive coding curricula using the JetBrains educational framework.
- **For Developers**: It bridges the gap between "knowing" the syntax and "applying" it to solve real-world problems.

---

## 🤝 Contributing

We welcome contributions! If you find a typo in the instructions or want to propose a new task:
1. Fork the repo.
2. Create a feature branch.
3. Submit a Pull Request with a clear description of your changes.

---

*Happy Coding!* 🚀
