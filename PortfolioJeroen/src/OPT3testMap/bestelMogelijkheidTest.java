package PortfolioJeroen.src.OPT3testMap;

import PortfolioJeroen.src.Bestelling;
import PortfolioJeroen.src.Lelie;
import PortfolioJeroen.src.Roos;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class bestelMogelijkheidTest {
    @Test
    public void kanBestellen(){

        Lelie Lelie = new Lelie(0, "Lelie");
        Roos Roos = new Roos(0, "Roos");

        assertEquals(-204.0,Bestelling.getPrijs(Lelie,24,true,true));
        assertEquals(360.0,Bestelling.getPrijs(Roos,24,false,false));
        assertEquals(281.775,Bestelling.getPrijs(Lelie,39,false,true));
        assertEquals(-497.25,Bestelling.getPrijs(Roos,39,true,false));
        assertEquals(-260.0,Bestelling.getPrijs(Lelie,40,true,false));
        assertEquals(331.5,Bestelling.getPrijs(Roos,40,false,true));
    }
}
