import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Game myGame = new Game();

    System.io.println("Welcome to Hangman!");

    //Loop while there is no hangman
    System.io.println("Please enter a letter.");
    String userGuessLetter = myConsole.readLine();
    myGame.acceptGuessedLetter(userGuessLetter);
    myGame.isLetterInWord(userGuessLetter);
    myGame.getUnguessedString

  }
}
