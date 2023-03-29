package PortfolioJeroen.src;

public class Bestelregel {
    private Bloem bloem;
    private int Aantal;

    private String Status;
    public Bestelregel(Bloem bloem, int Aantal, String Status){
        this.bloem = bloem;
        this.Aantal = Aantal;
        this.Status = Status;
    }

    public Bloem getBloem() {
        return bloem;
    }

    public int getAantal() {
        return Aantal;
    }

    public void setAantal(int aantal) {
        Aantal = aantal;
    }

    public void setBloem(Bloem bloem) {
        this.bloem = bloem;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getStatus() {
        return Status;
    }
}
