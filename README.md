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

Another implementation called `rotateRightOptimized` submitted by dlin2028 uses `String` concatenation to achieve the same result.

## 2. Tic-Tac-Toe Check
In this excercise, we check for tic-tac-toe wins only in the vertical and horizontal directions. We loop through all the horizontals and then the verticals to see if there are any matches. 

Instead of looping through only 3 rows and 3 columns, our code can loop through `x` rows and `y` columns depending on the input array involved. We only check for matches of 3, but it can accomdate matches of `Array.length` instead of 3 in a row for an `x` by `y` grid. 

Take for example a special case of Connect 4, we would check for `counter = 4` as we are looking for 4-in-a-row's. It is important to leave code in a modular fashion such that it can complete a wide range of cases and can adapt to new ones with minimal changes. Looping through "`Array.length`" times is much more dynamic than looping through a constant `3` times. As you can imagine, if we increased the grid to a 4x4 square, then it would only loop through the first 3 rows and 3 columns, disregarding the 4th ones. It is important to keep in mind the **scalability, maintainability, and reliability** of your code base for future projects.

## 3. LastTen
This is fairly straightforward. The comments should help clarify why the code is written in that form. One thing to note is we use the modulo operator (`%`) here again because it will help us continually loop over the array over and over as we increase our index. Below is an example of why modulo operator would work.

This is our array where we have added the numbers 1 to 10 consecutively using the `add()` method.
```
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

Let's say we wanted to add number `10`, and as the 11th number, the last 10 numbers would only range from `1` to `10` as soon as we add in this new number. Because the problem says we don't have to return in any specific order, we can just write `10` to the number we threw away, `0`. The table would look something like:
```
[10, 1, 2, 3, 4, 5, 6, 7, 8, 9] // add(10) adds the 11th term to the index 0
```

A pattern emerges as we continually write more numbers. Number `12` would go in index 2. Number `24` would go in index 4. Number `549782` would go in the index 2. As you can see, the index is given by the the `n % 10`th time we have looped through the array. On our 10th time, we would be resting on the 0th index, thus making the modulo operator awesome in helping us find the correct index. 

Important mentions:
- Another implentation without the modulo operator `%` is possible, which restarts the counter at 0 when the index hits 10 (as `Arrays` start from 0 to the nth - 1 index where `n` is the size)
- A good exercise for extra practice would be returning last 10 within order, probably using a list/stack or some other data structure. This would be a great time to delve into the important world of data structures :)
