# uiuc-cs125-practice
UIUC CS 125 Java Practice solutions for proficiency test

*This repository is meant to be a tool for students to review for the CS 125 Proficiency Test at UIUC. I have posted the solutions to the practice problems from PrarieLearn. To use this repository effectively, please do the problems yourself and then refer to this as a guide to help understand the concepts and syntax of Java. Below I've written up a short study guide about some core concepts touched upon in the practice problems.*


## Exam Information

[***For Newest Update, see the CS 125 course website*** ](https://cs125.cs.illinois.edu/info/proficiency/)

- Format: computer-based (Java)
- Length: 3 hours
- Location: CBTF
- Date and Time: Monday 8/17/2020 @ 9AM CT (Central Time), Friday 8/21/2020 @ 1PM CT (Central Time)
- More Information: is available on the CS 125 website.
- Sign-up process for Java:
  - Log on to the CBTF scheduling site.
  - Press the “Add a class” button and add the “Proficiency Exams” course.
  - Click the “CS 125” exam in the “Proficiency Exams” course and reserve a time.
  - Log on to PrairieLearn using your @illinois.edu email address. We will not give credit to students that take the exam using a non-university email address.
  - Enroll in the “CS 125: Introduction to Computer Science, Proficiency Exam” course. This is the same course with the practice problems and practice exam available publicly.         Once you are in the CBTF you will be able to view and complete the official proficiency exam.
  - When you visit the testing center the proficiency exam will be visible.

## Study Tools
You should use the following tools to help you study. Explanations on the PrarieLearn practice problems are below.
- [YouTube playlist](https://www.youtube.com/playlist?list=PLi9J8D4T_-po13lr8381OFhWqmE_xHDoO)
- PrarieLearn practice problems and practice exam
- APCS mutiplie choice problems

## Problem Sets
*These explanations go over concepts. For more in-depth understanding of the code, see the comments inside the code*
1. String Rotation
2. Tic-Tac-Toe Check
3. LastTen
4. Comparable Max
5. SimpleArrayList add
6. SimpledLinkedList remove
7. BinaryTree sum
8. BinaryTree Balanced
9. Insertion Sort
10. Working with Exceptions
11. Maps and Trees

## 1. String Rotation 
String Rotation is all about using the [modulus operation](https://en.wikipedia.org/wiki/Modulo_operation). The thinking behind this is because we need to loop back to the start of the `String` once we have counted up to the last `char` in the `String`. The modulo operator (which uses the modulus `%`) is syntactically written as `a % b`, and return the remainder when `a` is divided by `b`. Below are some examples to help you see why this is useful.
```java
5 % 2     // returns 1 because 5/2 has a remainder of 1
100 % 8   // returns 4
10 % 5    // returns 0 This means that the divisor (5) is a multiple of the dividend (10)
0 % 2     // returns 0
```
As you can most likely see, it makes sense to use this operator as if we continue to loop through the character array `char[] arr`, we will reach an index that is out of bounds and we will need to restart back at the start of the `String` and copy it over until we reach the index that we want shifted.
