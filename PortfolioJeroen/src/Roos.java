package PortfolioJeroen.src;


public class Roos extends Bloem{
    public Roos(int Aantal, String Type) {
        super(Aantal, Type);
    }

    @Override
    public String getType() {
        return "Rozen";
    }

    double prijs = 15.0;

    @Override
    public double getPrijs(int aantallen) {
        double actualprijs = 0;

        if(aantallen>=40){
            return actualprijs=0.65*(aantallen*prijs);
        }
        else{
            if(aantallen>=25){
                return actualprijs=0.85*(aantallen*prijs);
            }
            else{
                if(aantallen<25){
                    return actualprijs=aantallen*prijs;
                }
                else{
                    return 0.0;
                }}}}
}
