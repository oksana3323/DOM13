public class OperativnyiPamiyat {
private int obiom;
private String proizvoditel;

    public OperativnyiPamiyat(int obiom, String proizvoditel) {
        this.obiom = obiom;
        this.proizvoditel = proizvoditel;
    }

    public void setObiom(int obiom) {
        this.obiom = obiom;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public int getObiom() {
        return obiom;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }
    public String getinfo(){
        return "Obiom"+getObiom()+"\n"+"Proizvoditel"+getProizvoditel();
    }

}


