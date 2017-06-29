import java.util.ArrayList;

public class Game {
  private ArrayList<String> mGuessedLettersArray = new ArrayList();

  public Game() {


  }

  public ArrayList<String> getGuessedLettersArray() {
    return mGuessedLettersArray;
  }

  public ArrayList<String> addGuessedLetter(String myLetter) {

    ArrayList<String> result = getGuessedLettersArray();
    if (!isDuplicateGuessed(myLetter)) {
     result.add(myLetter);
    }

    return result;
  }

  public boolean isDuplicateGuessed(String myLetter) {
    ArrayList<String> thisList = getGuessedLettersArray();
    if (thisList.contains(myLetter)) {
      return true;
    } else {
      return false;
    }
  }
}
