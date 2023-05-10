package PortfolioJeroen.src;

public abstract class Bloem {
   protected int aantal;
   protected String Type;
   protected double prijs;

   public Bloem(int aantal, String Type){
      this.aantal = aantal;
      this.Type = Type;
   }

public int getAantalBloemen(){
   return aantal;
}

   public String getType() {
      return Type;
   }

   public double getPrijs(int aantallen) {return prijs;}
}
