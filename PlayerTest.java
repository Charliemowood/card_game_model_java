import static org.junit.Assert.assertEquals;
import org.junit.*;

  public class PlayerTest {
    Player player;
    Player secondPlayer;

    @Before
    public void before() {
      player = new Player("Charlie", 14);
      secondPlayer = new Player("Zuzana", 11);
    }

    @Test
    public void hasName() {
      assertEquals("Charlie", player.getName());
    }

    @Test
    public void hasValue() {
      assertEquals(11, secondPlayer.getCardValue());
    }

    @Test
    public void hasNameSecondPlayer() {
      assertEquals("Zuzana", secondPlayer.getName());
    }

   }
