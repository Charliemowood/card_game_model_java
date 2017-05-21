import static org.junit.Assert.assertEquals;
import org.junit.*;

  public class CardTest {
  Card card;

    @Before
      public void before() {
      card = new Card(1);
    }

    @Test
     public void hasName() {
       assertEquals(1, card.getValue());
     }

}
