import static org.junit.Assert.assertEquals;
import org.junit.*;

  public class PlayerTest {
    Player player;
    Player second_player;

    @Before
    public void before() {
      player = new Player("Charlie");
      second_player = new Player("Zuzana");
    }

    @Test
    public void hasName() {
      assertEquals("Charlie", player.getName());
    }

    @Test
    public void hasNameSecondPlayer() {
      assertEquals("Zuzana", second_player.getName());
    }
   }
