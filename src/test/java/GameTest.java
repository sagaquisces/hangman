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
    assertEquals(new ArrayList(), testGame.getGuessedLettersArray());
  }

  @Test
  public void newGame_addsToGuessedArray_arrayWithStringA() {
    Game testGame = new Game();
    ArrayList<String> testList = testGame.getGuessedLettersArray();
    testList.add("a");

    assertEquals(testList,testGame.addGuessedLetter("a"));
  }

  @Test
  public void isDuplicate_checksForDuplicateGuessedLetter_true() {
    Game testGame = new Game();
    ArrayList<String> testList = testGame.getGuessedLettersArray();
    testGame.addGuessedLetter("a");
    assertEquals(true,testGame.isDuplicateGuessed("a"));
  }

}
