package PortfolioJeroen.src;

public class Lelie extends Bloem{
    public Lelie(int Aantal, String Type) {
        super(Aantal, Type);
    }

    @Override
    public String getType() {
        return "Lelies";
    }
}
