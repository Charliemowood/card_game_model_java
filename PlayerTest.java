import static org.junit.Assert.assertEquals;
import org.junit.*;

  public class PlayerTest {
    Player player;

    @Before
    public void before() {
      player = new Player("Charlie");
    }

    @Test
    public void hasName() {
      assertEquals("Charlie", player.getName());
    }
   }
