package PortfolioJeroen.src;

public class Roos extends Bloem{
    public Roos(int Aantal, String Type) {
        super(Aantal, Type);
    }

    @Override
    public String getType() {
        return "Rozen";
    }
}
