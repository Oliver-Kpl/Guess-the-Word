# PRIMM: Guess the Word

## Predict
Without running the program, **predict** two things.

1. What is the program **supposed.** to do?
    > your answer

2. What does the program **actually** do?
    > your answer

## Run
Now run the program. 

3. What did the program actually do?
    > your answer

## Investigate
1. Go through the code and **annotate** with single line comments what the major blocks of code do.

2. Based on the instructor's lecture, why is the `while` loop not breaking when the user enters the correct answer?

## Modify
1. Correct the while loop so that the `while` loop breaks when the user enters the correct answer.

2. Change the `getRandomWord()` method so that it actually selects a random word from the list.

## Make
1. Modify the program so that it limits the number of user guesses.

2. Modify the program so that it tells the user how many characters are in the word.

3. Modify the program so that it gives more detailed feedback about their guesses. See the output below:

```
Guess the 3-letter word I'm thinking of: *** 
5 guesses left: the

Your answer 'the' comes after the correct one in alphabetical order. ***
4 guesses left: dog


Your answer 'dog' comes before the correct one in alphabetical order. *o*
3 guesses left: fox

You guessed the answer 'fox' correctly in 3 guesses!
```
