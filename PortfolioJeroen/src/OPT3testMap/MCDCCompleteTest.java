package PortfolioJeroen.src.OPT3testMap;

//Deze test zijn alle 3 de tests in 1 bestand. Dit heb ik gedaan zodat ik alle tests mooier in 1 screenshot
//kon krijgen in mijn word bestand.

import PortfolioJeroen.src.Bestelling;
import PortfolioJeroen.src.Lelie;
import PortfolioJeroen.src.Main;
import PortfolioJeroen.src.Roos;
import org.junit.Test;

import static PortfolioJeroen.src.Main.wijzigBestel;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MCDCCompleteTest {
    @Test
    public void CorrectIngevoerd(){

    String type = "1";
    String typeWB = "2";
    int aantal = 100;
    String expectedType = "Lelies";
    Lelie Lelie = new Lelie(aantal, "Lelie");
    Roos Roos = new Roos(aantal, "Roos");

    Main.doorvoeren(type, aantal, 1);
    Bestelling.voegBestellingToe(typeWB, aantal, 0);
    Bestelling.voegBestellingToe(type, aantal, 0);
    wijzigBestel(Lelie, Roos, 0, 1);

    assertEquals(expectedType, Bestelling.bestelling.get(0).getBloem().getType());
    assertTrue(Bestelling.bestelling.get(0).isDoorgevoerd());
    assertEquals(expectedType, Bestelling.bestelling.get(0).getBloem().getType());
    }
}
