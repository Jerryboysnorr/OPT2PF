package PortfolioJeroen.src.Test;
import PortfolioJeroen.src.Bestelling;
import PortfolioJeroen.src.Roos;
import org.junit.Test;

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
        String type = "1";
        int aantal = 100;
        Bestelling.voegBestellingToe(type, aantal);
        String expectedType = "Rozen";

        Roos roos = new Roos(Bestelling.bestelling.get(0).getAantal(), "Rozen");
        //act

        Bestelling.bestelling.get(0).setStatus("Verwerken");

        //assert

        assertEquals(Bestelling.bestelling.get(0).getStatus(), "Verwerken");

    }
}