/**
 * This program is a simple password guessing game. It's missing
 * features and is buggy. The PRIMM activity will help you fix it.
 * It will also help you learn things about Strings.
 * @author
 * @version 1.0
 * @since 2024-11-
 */

import java.util.Scanner;

class GuessTheWord {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    String correct = getRandomWord();
    String userGuess;

    System.out.printf("Guess the %d letter word I'm thinking of: ", correct.length());
    userGuess = console.next();
    console.nextLine();  // Removes \n
    int guessCount = 0;
    while (!userGuess.equals(correct)) {
      if (guessCount == 4) {
        System.out.println("You've run out of guesses. The word was: " + correct);
        console.close();
        return;
      }
      guessCount++;
      // reprompt and retry
      System.out.printf("%d guesses left. Try again: ", 5 - guessCount);
      userGuess = console.nextLine();
    }

    console.close();

    System.out.println("You guessed the answer correctly!");
    
  }

  /**
   * Retrieves a random word using the structures we know so far.
   * There are many far more elegant ways to do this, and you will
   * get to practice those.
   * @return String for the random word
   */
  public static String getRandomWord() {    
    String [] words = new String[] {
        "the", "quick", "red", "fox", "jumped", "over", "lazy", "brown", "dog"
    };

    int random = (int) (Math.random() * words.length);

    return words[random];
  }
}