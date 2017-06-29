import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;

public class GameTest {

  @Test
  public void newGame_instantiatesCorrectly() {
    Game testGame = new Game();
    assertEquals(true, testGame instanceof Game);
  }

  @Test
  public void newGame_getGuessedArray_emptyArray() {
    Game testGame = new Game();
    ArrayList<String> testList = testGame.getGuessedLettersArray();
    assertEquals(new ArrayList<String>(), testGame.getGuessedLettersArray());
  }

  @Test
  public void newGame_addsToGuessedArray_arrayWithStringA() {
    Game testGame = new Game();
    ArrayList<String> testList = testGame.getGuessedLettersArray();
    testList.add("a");

    assertEquals(testList,testGame.acceptGuessedLetter("a"));
  }

  @Test
  public void isDuplicate_checksForDuplicateGuessedLetter_true() {
    Game testGame = new Game();
    ArrayList<String> testList = testGame.getGuessedLettersArray();
    testGame.acceptGuessedLetter("a");
    testGame.acceptGuessedLetter("a");
    assertEquals(true,testGame.isDuplicateGuessed("a",testList));
  }

  @Test
  public void getSecretWord_getsSecretWord_secret() {
    Game testGame = new Game();
    assertEquals("secret",testGame.getSecretWord());
  }

  @Test
  public void isLetterInWord_checkIfLetterIsInSecretWord_true() {
    Game testGame = new Game();
    String testLetter = "e";
    assertEquals(true, testGame.isLetterInWord(testLetter));
  }

  @Test
  public void getIndexOfMatchedLetter_getIndexOfGuessedLetterInSecretWord_5(){
    Game testGame = new Game();
    String testLetter = "t";
    char testChar = testLetter.charAt(0);
    String testSecretWord = testGame.getSecretWord();
    int testIndex = testSecretWord.indexOf(testChar);
    assertEquals(5, testGame.getIndexOfMatchedLetter("t"));
  }

  @Test
  public void replaceIndexOfUnguessedWord_applyLetterToUnguessedWord______t(){
    Game testGame = new Game();
    assertEquals("_____t" , testGame.replaceIndexOfUnguessedWord(5,"t"));
  }

  @Test
  public void replaceIndexOfSecretWord_applyAsteriskToSecretWordSECREAsterisk(){
    Game testGame = new Game();
    assertEquals("secre*", testGame.replaceIndexOfSecretWord(5));
  }

  @Test
  public void swapGuessedLetter_replaceMultipleInstanceOfLetters2(){
    Game testGame = new Game();
    assertEquals(2, testGame.swapGuessedLetter("e"));
  }

  @Test
  public void isWinner_seeIfCounterEqualsLength_true() {
    Game testGame = new Game();
    int myCounter = testGame.setCounter(6);
    assertEquals(true, testGame.isWinner());
  }






}
