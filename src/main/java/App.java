import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Game myGame = new Game();

    System.out.println("Welcome to Hangman!");
    System.out.println(myGame.getUnguessedString());
    while (!myGame.isWinner()) {
      System.out.println("Please enter a letter.");
      String userGuessedLetter = myConsole.readLine();
      System.out.println("Your guesses: " + myGame.acceptGuessedLetter(userGuessedLetter));
      System.out.println("Your letter is in word?" + myGame.isLetterInWord(userGuessedLetter));
      System.out.println("Number of matches: " + myGame.swapGuessedLetter(userGuessedLetter));
      System.out.println(myGame.getUnguessedString());

    }
    // System.out.println("Please enter a letter.");
    // String userGuessedLetter = myConsole.readLine();
    // System.out.println("Your guesses: " + myGame.acceptGuessedLetter(userGuessedLetter));
    // System.out.println("Your letter is in word?" + myGame.isLetterInWord(userGuessedLetter));
    // System.out.println("Number of matches: " + myGame.swapGuessedLetter(userGuessedLetter));
    // System.out.println(myGame.getUnguessedString());
    System.out.println("Your done");

  }
}
