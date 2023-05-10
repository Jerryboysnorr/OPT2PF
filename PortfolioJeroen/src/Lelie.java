package PortfolioJeroen.src;

public class Lelie extends Bloem{
    public Lelie(int Aantal, String Type) {
        super(Aantal, Type);
    }
    double prijs = 10.0;
    @Override
    public String getType() {
        return "Lelies";
    }

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
