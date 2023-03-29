package PortfolioJeroen.src;

public class Klant {
    private String naam;
    private String adres;;

    public Klant(String naam, String adres){
        this.naam = naam;
        this.adres = adres;
    }

    public String getNaam(){
        return naam;
    }

    public String getAdres(){
        return adres;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
