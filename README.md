# math-quiz
A simple math quiz program built using Java

This program is for practising multiplication of numbers. 

## Part A

In the class MathQuiz, there is a method:
```
public static void partA()
```

The method features a loop that runs 10 times. In each step of the loop, the program should:
* Generate two random integer numbers in the range 10 to 20 (inclusive).
* Ask the user to compute the product of these two numbers.
* Check the answer entered by the user. Inform the user if the answer was correct or not. You can assume that the user input is an integer number.
* Display the current score of correct answers and the total numbers of answers given. 

Here is the log from a sample run:
```
MathQuiz - Part 1A
10 * 18 = ?
180
Correct answer. Score: 1(1)
16 * 11 = ?
176 Correct answer. Score: 2(2)
18 * 16 = ?
238
Incorrect answer. Score: 2(3)
17 * 19 = ?
363
Incorrect answer. Score: 2(4)
12 * 16 = ?
292
Incorrect answer. Score: 2(5)
16 * 10 = ?
160
Correct answer. Score: 3(6)
16 * 11 = ? 176
Correct answer. Score: 4(7)
15 * 15 = ?
225
Correct answer. Score: 5(8)
11 * 17 = ?
188
Incorrect answer. Score: 5(9)
14 * 13 = ?
182
Correct answer. Score: 6(10
Good-bye 
```

## Part B

In the class MathQuiz, there is a method:
```
public static void partB()
```

The program implements a similar functionality as in Part A - it repeatedly asks the user to compute the product of two randomly generated integers in the range 10 to 20. There are a couple of differences:
* The number of multiplication problems should not be fixed. Instead, the program should keep posing new multiplication problems until the user decides to quit by entering the letter "q". 
* The program should be able to deal with invalid input by the user. It should ignore such input and restate the current multiplication problem. 

Here is log from a sample program run:
```
MathQuiz - Part 1B
18 * 12 = ?
216
Correct answer. Score: 1(1)
14 * 16 = ?
a
Invalid input
14 * 16 = ?
224
Correct answer. Score: 2(2)
11 * 20 = ?
230
Incorrect answer. Score: 2(3)
12 * 16 = ?
192
Correct answer. Score: 3(4)
19 * 11 = ?
q
Good-bye 
```
