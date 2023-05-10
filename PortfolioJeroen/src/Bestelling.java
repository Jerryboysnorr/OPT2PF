package PortfolioJeroen.src;

import java.util.ArrayList;

public class Bestelling {
    public static ArrayList<Bestelregel> bestelling = new ArrayList<>();

    public static void voegBestellingToe(String type, int aantal, int key) {

        if (key == 0) {
            if (type.equals("1")) {
                Lelie lelie = new Lelie(aantal, "Lelies");
                Bestelregel bestelregel = new Bestelregel(lelie, aantal, "Wordt verwacht..", false);
                bestelling.add(bestelregel);
            } else {
                Roos roos = new Roos(aantal, "Rozen");
                Bestelregel bestelregel = new Bestelregel(roos, aantal, "Wordt verwacht..", false);
                bestelling.add(bestelregel);
            }
        } else {
            if (type.equals("1")) {
                Lelie lelie = new Lelie(aantal, "Lelies");
                Bestelregel bestelregel = new Bestelregel(lelie, aantal, "Wordt verwacht..", true);
                bestelling.add(bestelregel);
            } else {
                Roos roos = new Roos(aantal, "Rozen");
                Bestelregel bestelregel = new Bestelregel(roos, aantal, "Wordt verwacht..", true);
                bestelling.add(bestelregel);}}}

    public static double getPrijs(Bloem type, int aantal, boolean doorgevoerd, boolean kortingskaart){
        double prijs=type.getPrijs(aantal);

        if(kortingskaart){
            prijs = prijs*0.85;
        }

        if(doorgevoerd){
            prijs = prijs * -1;
        }

        return prijs;
    }
}

