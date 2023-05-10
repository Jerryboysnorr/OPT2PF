package PortfolioJeroen.src.Test;

import PortfolioJeroen.src.Bestelling;
import PortfolioJeroen.src.Main;
import PortfolioJeroen.src.Roos;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class doorgevoerdTest {
    @Test
    public void prepare(){
        //arrange
        String type = "1";
        int aantal = 100;

        
        //act
        Main.doorvoeren(type, aantal, 1);

        //assert

        assertTrue(Bestelling.bestelling.get(0).isDoorgevoerd());

    }
}
