package PortfolioJeroen.src.Test;

import PortfolioJeroen.src.Lelie;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class getPrijs {
    int aantal = 0;
    int aantal1 = 1;
    int aantal2 = 24;
    int aantal3 = 25;
    int aantal4 = 26;
    int aantal5 = 39;
    int aantal6 = 40;
    int aantal7 = 41;

    @Test
    public void getPrijs(){
        assertEquals(0.0,new Lelie(1,"").getPrijs(aantal));
        assertEquals(10.0,new Lelie(1,"").getPrijs(aantal1));
        assertEquals(240.0,new Lelie(1,"").getPrijs(aantal2));
        assertEquals(212.5,new Lelie(1,"").getPrijs(aantal3));
        assertEquals(221.0,new Lelie(1,"").getPrijs(aantal4));
        assertEquals(331.5,new Lelie(1,"").getPrijs(aantal5));
        assertEquals(260.0,new Lelie(1,"").getPrijs(aantal6));
        assertEquals(266.5,new Lelie(1,"").getPrijs(aantal7));
    }
}
