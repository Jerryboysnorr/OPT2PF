package PortfolioJeroen.src.Test;
import PortfolioJeroen.src.Bestelling;
import PortfolioJeroen.src.Lelie;
import PortfolioJeroen.src.Roos;
import org.junit.Test;

import static PortfolioJeroen.src.Main.wijzigBestel;
import static junit.framework.TestCase.assertEquals;
/*
Deze test heeft als doel te testen of het werkt om een status van een bestelregel te wijzigen.
Hiervoor gebruik ik een bestelling die ik in arrange plaats.
Dit doe ik in de vorm Arrange-Act-Assert.
 */


public class wijzigBestellingTest {
    @Test
    public void prepare(){
        //arrange
        String typeWB = "2";
        int aantal = 100;
        Bestelling.voegBestellingToe(typeWB, aantal, 0);
        String expectedType2 = "Lelies";
        Lelie Lelie = new Lelie(aantal, "Lelie");
        Roos Roos = new Roos(aantal, "Roos");

        //act

        wijzigBestel(Lelie, Roos, 0, 1);

        //assert

        assertEquals(expectedType2, Bestelling.bestelling.get(0).getBloem().getType());
    }
}