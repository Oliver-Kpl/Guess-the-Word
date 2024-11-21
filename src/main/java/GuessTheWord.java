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
    
    System.out.print("Guess the word I'm thinking of: ");
    userGuess = console.next();
    console.nextLine();  // why???!

    while (userGuess != correct) {

        // reprompt and retry
      System.out.print("Sorry. That's not right. Guess again: ");
      userGuess = console.next();
      console.nextLine();
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

    int random = 0;

    return words[random];
  }
}