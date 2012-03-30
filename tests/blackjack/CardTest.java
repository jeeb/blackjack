package blackjack; /**
 * Created with IntelliJ IDEA.
 * User: jeekstro
 * Date: 30.3.2012
 * Time: 16:27
 * To change this template use File | Settings | File Templates.
 */
import org.junit.*;
import static org.junit.Assert.*;
import blackjack.Card;

public class CardTest {

    @Test
    public void test_isConcealed() {
        System.out.println("Test if a created concealed card is really concealed.");
        Card testcard = new Card(Card.Suit.SPADES, Card.Rank.ACE , true);

        assertTrue(testcard.isConcealed() == true);

    }
}
