package PortfolioJeroen.src;

import java.util.Scanner;

//Jeroen Ravensbergen 22073442

public class Main {
    static boolean ingelogd = false;
    static boolean kortingskaart = false;

    static boolean kweker = false;
    static String naam;
    static String naamKlant = "geen klant";
    static String adresKlant = "geen adres beschikbaar";


    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Welkom bij FlowerSoft prototype.");
        System.out.println("Typ \"Login\" gevolgd door \"klant\" of \"kweker\" om in te loggen.");
        System.out.println("=================================");
        Scanner scanner = new Scanner(System.in);

        Lelie Lelie = new Lelie(43, "Lelie");
        login(scanner.nextLine());

    }

    public static void login(String ja){
        System.out.println();
        System.out.println();
        System.out.println();
        if(ja.equals("Login klant") || ja.equals("login klant")){
            if(ingelogd) {
                naam = naamKlant;
                SelecteerOptie(naam);
            }
            else{
                gegevensInvullen();
            }
        }
        else{
            if(ja.equals("Login kweker") || ja.equals("login kweker")){
                kweker=true;
                naam = "kweker";
SelecteerOptieKweker();
            }
        else{
            System.out.println("Voer een geldige Login in a.u.b.");
            Scanner scanner = new Scanner(System.in);
            login(scanner.nextLine());
        }}
    }

    public static void SelecteerOptieKweker(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=======================");
        System.out.println("Welkom");
        System.out.println("Selecteer uit de lijst (Typ het nummer):");
        System.out.println("=======================");
        System.out.println("1. Bestellijst weergeven");
        System.out.println("2. Terug naar login ");
        Scanner scanner = new Scanner(System.in);
        String optie = scanner.nextLine();
        if(optie.equals("1")){
            toonBestelLijst();
        }
        else{
            if(optie.equals("2")){
                kweker=false;
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Voer een geldige Login (klant of kweker) in:");
                login(scanner.nextLine());
            }
            else{
                System.out.println("Dit is geen optie.");
                System.out.println("Selecteer opnieuw:");
                SelecteerOptieKweker();
            }}
    }

    public static void SelecteerOptie(String naam){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=======================");
        System.out.println("Welkom " + naam);
        System.out.println("Selecteer uit de lijst (Typ het nummer):");
        System.out.println("=======================");
        System.out.println("1. Bestelling plaatsen ");
        System.out.println("2. Bestellijst weergeven ");
        System.out.println("3. Terug naar login ");
        Scanner scanner = new Scanner(System.in);
        String optie = scanner.nextLine();
            if(optie.equals("1")){
aanmaken();
            }
            else{
        if(optie.equals("2")){
toonBestelLijst();
        }
        else{
            if(optie.equals("3")){
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Voer een geldige Login (klant of kweker) in:");
                login(scanner.nextLine());

            }
            else{
                System.out.println("Dit is geen optie.");
                System.out.println("Selecteer opnieuw:");
                SelecteerOptie(naam);
            }
        }}}

public static void aanmaken(){
    System.out.println();
    System.out.println();
    System.out.println();
        Scanner scanner = new Scanner(System.in);
                String koekoek;
                int aantal;
    System.out.println("=======================");
    System.out.println("Selecteer beschikbare bloemen (typ het nummer):");
    System.out.println("1. Lelie");
    System.out.println("2. Roos");
    System.out.println("=======================");
    koekoek = scanner.nextLine();
    if(koekoek.equals("1")){
koekoek = "1";
    }
    else{
        if(koekoek.equals("2")){
koekoek="2";
        }
        else{
            System.out.println("Dat is geen optie.");
            aanmaken();
        }
    }
    System.out.println("=======================");
    System.out.println("Voer aantal in");
    System.out.println("=======================");
    aantal = scanner.nextInt();

    Bestelling.voegBestellingToe(koekoek, aantal, 0);
System.out.println("Bestelling succesvol geplaatst!");
SelecteerOptie(naam);
        }


        public static void gegevensInvullen(){
            System.out.println();
            System.out.println();
            System.out.println();
        Scanner scanner = new Scanner(System.in);
            System.out.println("=======================");
            System.out.println("Wat is uw naam?");
            System.out.println("=======================");
           String name = scanner.nextLine();
            System.out.println("=======================");
            System.out.println("Wat is uw Adres? (Straat huisnummer Postcode)");
            System.out.println("=======================");
            String adres = scanner.nextLine();
            System.out.println("=======================");
            System.out.println("Heeft u een kortingskaart?");
            System.out.println("=======================");
            String kort = scanner.nextLine();
            if(kort.equals("ja")){kortingskaart = true;}
            Klant klant = new Klant(name, adres);
            adresKlant=klant.getAdres();
            naamKlant = klant.getNaam();
            naam = naamKlant;
            ingelogd=true;

            SelecteerOptie(naam);
        }


        public static void toonBestelLijst(){
        double totaalprijs = 0;
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("=======================");
            System.out.println("Bestellijst van "+ naamKlant +":");
            System.out.println("Wordt bezorgd op: " + adresKlant);
            System.out.println("=======================");
        for(Bestelregel bestellingen: Bestelling.bestelling){
            Bloem bloem = bestellingen.getBloem();
        System.out.println("  " + bloem.getType() + " " + bestellingen.getAantal() + " stuks " + "status: " + bestellingen.getStatus());
        totaalprijs = bestellingen.getBloem().getPrijs(bestellingen.getAantal());
        }
        if(kortingskaart){System.out.println("15% extra korting >>");totaalprijs=totaalprijs*0.85;}
        System.out.println("Prijs: " + totaalprijs);
        if(kweker) {
            bestellijstMenuKweker();}
        else{
            bestellijstMenu();
        }
    }


            public static void bestellijstMenu(){
                System.out.println("=======================");
                System.out.println("1. Bestelling wijzigen ");
                System.out.println("2. Bestelling verwijderen ");
                System.out.println("3. Terug naar menu ");
                Scanner scanner = new Scanner(System.in);
                String optie = scanner.nextLine();
                if(optie.equals("1")){
wijzigBestelling();
                }
                else{
                if(optie.equals("2")){
                    verwijderBestelling();
                }
                else{
                if(optie.equals("3")){
                    SelecteerOptie(naam);
                }
                else{
                    System.out.println("Dit is geen optie.");
                    System.out.println("Selecteer opnieuw:");
                    bestellijstMenu();
                }
            }}}

    public static void bestellijstMenuKweker(){
        System.out.println("=======================");
        System.out.println("1. Status wijzigen");
        System.out.println("2. Bestelling doorvoeren");
        System.out.println("3. Terug naar menu ");
        Scanner scanner = new Scanner(System.in);
        String optie = scanner.nextLine();
        if(optie.equals("1")){
            wijzigStatus();
        }
        else{
            if(optie.equals("2")){
doorvoerMenu();
            }
            if(optie.equals("3")){
                SelecteerOptieKweker();
            }
            else{
                System.out.println("Dit is geen optie.");
                System.out.println("Selecteer opnieuw:");
                bestellijstMenuKweker();
                }
            }}

    public static void doorvoerMenu(){
        System.out.println();
        System.out.println();
        System.out.println();
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String koekoek;
        int aantal;
        System.out.println("=======================");
        System.out.println("Selecteer beschikbare bloemen (typ het nummer):");
        System.out.println("1. Lelie");
        System.out.println("2. Roos");
        System.out.println("=======================");
        koekoek = scanner.nextLine();
        if(koekoek.equals("1")){
            koekoek = "1";
        }
        else{
            if(koekoek.equals("2")){
                koekoek="2";
            }
            else{
                System.out.println("Dat is geen optie.");
                doorvoerMenu();
            }
        }
        System.out.println("=======================");
        System.out.println("Voer aantal in");
        System.out.println("=======================");
        aantal = scanner.nextInt();

doorvoeren(koekoek,aantal,1);
        System.out.println("Bestelling succesvol doorgevoerd!");
        SelecteerOptieKweker();
    }

    public static void doorvoeren(String type, int aantal, int key){
        Bestelling.voegBestellingToe(type, aantal, key);
    }

    public static void wijzigStatus(){
        System.out.println();
        System.out.println();
        System.out.println();
        int i = 0;
        for(Bestelregel bestellingen: Bestelling.bestelling){
            Bloem bloem = bestellingen.getBloem();
            System.out.println(i +". "+ bloem.getType() + " " + bestellingen.getAantal() + " stuks " + "status: " + bestellingen.getStatus());
            i++;
        }
        System.out.println("=======================");
        System.out.println("Van welke bestelling wilt u de status wijzigen?");
        Scanner scanner = new Scanner(System.in);
        int optie = scanner.nextInt();
        if(optie<=Bestelling.bestelling.size()){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("=======================");
            System.out.println("Wat is de status?");

            Scanner scanner2 = new Scanner(System.in);
            String stop = scanner2.nextLine();
            Bestelling.bestelling.get(optie).setStatus(stop);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Succesvol gewijzigd!");
            bestellijstMenuKweker();
        }
        else{
            System.out.println("Dit is geen optie.");
            System.out.println("Selecteer opnieuw:");
            wijzigStatus();
        }
    }

           public static void verwijderBestelling(){
               System.out.println();
               System.out.println();
               System.out.println();
        int i = 0;
               for(Bestelregel bestellingen: Bestelling.bestelling){
                   Bloem bloem = bestellingen.getBloem();
                   System.out.println(i +". "+ bloem.getType() + " " + bestellingen.getAantal() + " stuks");
                   i++;
               }
               System.out.println("=======================");
               System.out.println("Welke bestelling wilt u verwijderen? (Typ het nummer)");
               Scanner scanner = new Scanner(System.in);
               int optie = scanner.nextInt();
               if(optie<=Bestelling.bestelling.size()){
                   Bestelling.bestelling.remove(optie);
                   System.out.println("Succesvol verwijderd!");
                   bestellijstMenu();
               }
               else{
                   System.out.println("Dit is geen optie.");
                   System.out.println("Selecteer opnieuw:");
                   verwijderBestelling();
               }

           }

public static void wijzigBestelling(){
    System.out.println();
    System.out.println();
    System.out.println();
    int i = 0;
    for(Bestelregel bestellingen: Bestelling.bestelling){
        Bloem bloem = bestellingen.getBloem();
        System.out.println(i +". "+ bloem.getType() + " " + bestellingen.getAantal() + " stuks");
        i++;
    }
    System.out.println("=======================");
    System.out.println("Welke bestelling wilt u wijzigen? (Typ het nummer)");
    Scanner scanner = new Scanner(System.in);
    int optie = scanner.nextInt();
    if(optie<=Bestelling.bestelling.size()){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=======================");
        System.out.println("Wat wilt u wijzigen aan bestelling "+optie+"? (Typ het nummer)");
        System.out.println("1. bloem type: "+Bestelling.bestelling.get(optie).getBloem().getType());
        System.out.println("2. stuks: "+Bestelling.bestelling.get(optie).getAantal());

        Scanner scanner2 = new Scanner(System.in);
        int optie2 = scanner2.nextInt();
        if(optie2==1){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("=======================");
            System.out.println("Selecteer eschikbare bloemen (typ het nummer):");
            System.out.println("1. Lelie");
            System.out.println("2. Roos");

            optie2 = scanner.nextInt();

            Lelie Lelie = new Lelie(Bestelling.bestelling.get(optie).getAantal(), "Lelie");
            Roos Roos = new Roos(Bestelling.bestelling.get(optie).getAantal(), "Roos");

            if(optie2==1){
wijzigBestel(Lelie, Roos, optie, optie2);
                System.out.println("Succesvol gewijzigd!");
toonBestelLijst();
            }
            else{
                if(optie2==2){
                    wijzigBestel(Lelie, Roos, optie, optie2);
                    System.out.println("Succesvol gewijzigd!");
                    toonBestelLijst();
                }
                else{
                    System.out.println("Dat is geen optie.");
                    wijzigBestelling();
                }
            }

        }
        else{
            if(optie2==2) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("=======================");
                System.out.println("Hoeveel stuks?");
                Scanner scanner3 = new Scanner(System.in);
                int optie3 = scanner3.nextInt();
                Bestelling.bestelling.get(optie).setAantal(optie3);
                System.out.println("Succesvol gewijzigd!");
                bestellijstMenu();
            }
            else {
                System.out.println("Dit is geen optie.");
                System.out.println("Selecteer opnieuw:");
                wijzigBestelling();
            }


        bestellijstMenu();
    }}
    else{
        System.out.println("Dit is geen optie.");
        System.out.println("Selecteer opnieuw:");
        wijzigBestelling();
    }

}

public static void wijzigBestel(Lelie Lelie, Roos Roos, int optie, int optie2){
    if(optie2==1){
        Bestelling.bestelling.get(optie).setBloem(Lelie);
    }
    else{if(optie2==2){
            Bestelling.bestelling.get(optie).setBloem(Roos);
        }}}

    public static double getPrijs(){

        return 0.0;
    }
}



