package PortfolioJeroen.src.Test;

import PortfolioJeroen.src.Bestelling;
import PortfolioJeroen.src.Bestelregel;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
/*
Deze test heeft als doel te testen of de functie om een bestelling toe te voegen aan de Bestellijst
werkt. Hiervoor ga ik een bestelling plaatsen en deze test uitvoeren in de vorm
Arrange-Act-Assert.
 */


public class BestellingTest {
@Test
   public void prepare(){
    //arrange
String type = "1";
int aantal = 100;
String expectedType = "Lelies";

    //act

    Bestelling.voegBestellingToe(type, aantal);

    //assert
    assertEquals(expectedType, Bestelling.bestelling.get(0).getBloem().getType());
}
}
