import java.util.ArrayList;

public class Game {
  private ArrayList<String> mGuessedLettersArray = new ArrayList<String>();
  private String mSecretWord;
  private String mUnguessedString;
  private int mCounter = 0;
  public Game() {
    mSecretWord = "secret";
    mUnguessedString = "______";
  }

  public ArrayList<String> getGuessedLettersArray() {
    return mGuessedLettersArray;
  }

  public String getSecretWord () {
    return mSecretWord;
  }

  public String getUnguessedString () {
    return mUnguessedString;
  }

  public int getCounter () {
    return mCounter;
  }

  public void setUnguessedString (String thisString) {
    mUnguessedString = thisString;
  }

  public void setSecretWord (String thisString) {
    mSecretWord = thisString;
  }

  public int setCounter (int n) {
    mCounter += n;
    return mCounter;
  }

  public ArrayList<String> acceptGuessedLetter(String myLetter) {

    ArrayList<String> result = getGuessedLettersArray();

    if(!isDuplicateGuessed(myLetter,result))
    {
      result.add(myLetter);
    }

    return result;
  }

  public boolean isDuplicateGuessed(String myLetter, ArrayList<String> myArray) {
    //ArrayList<String> thisList = getGuessedLettersArray();
    if (myArray.contains(myLetter)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isLetterInWord(String myLetter) {
    String mySecretWord = getSecretWord();
    if (mySecretWord.contains(myLetter)) {
      return true;
    } else {
      return false;
    }
  }

  public int getIndexOfMatchedLetter(String myLetter) {
    char testChar = myLetter.charAt(0);
    String mySecretWord = getSecretWord();
    return mySecretWord.indexOf(testChar);
  }

  public String replaceIndexOfUnguessedWord(int myIndex, String myLetter) {
    String myUnguessedString = getUnguessedString();
    char myPlaceholder = myUnguessedString.charAt(myIndex);
    myUnguessedString = myUnguessedString.substring(0,myIndex) + myLetter + myUnguessedString.substring(myIndex+1);
    setUnguessedString(myUnguessedString);
    return getUnguessedString();
  }

  public String replaceIndexOfSecretWord(int myIndex) {
    String mySecretWord = getSecretWord();
    char myPlaceholder = mySecretWord.charAt(myIndex);
    mySecretWord = mySecretWord.substring(0,myIndex) + "*" + mySecretWord.substring(myIndex+1);
    setSecretWord(mySecretWord);

    return getSecretWord();
  }

  public int swapGuessedLetter (String myLetter) {

    while (isLetterInWord(myLetter)){
      int myIndex = getIndexOfMatchedLetter(myLetter);
      replaceIndexOfUnguessedWord(myIndex, myLetter);
      replaceIndexOfSecretWord(myIndex);
      setCounter(1);
    }
    return getCounter();
  }

  public boolean isWinner() {
    if(getSecretWord().length() == getCounter()) {
      return true;
    } else {
      return false;
    }
  }


}
