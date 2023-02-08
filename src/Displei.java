public class Displei {
    private String diagonal;
    private String proizvoditel;
    private String TipMatrisa;

    public Displei(String diagonal, String proizvoditel, String tipMatrisa) {
        this.diagonal = diagonal;
        this.proizvoditel = proizvoditel;
        TipMatrisa = tipMatrisa;
    }



    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public void setTipMatrisa(String tipMatrisa) {
        TipMatrisa = tipMatrisa;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public String getTipMatrisa() {
        return TipMatrisa;
    }
public String getinfo(){
        return "Dioganol:"+getDiagonal()+"\n"+"Proizvoditel:"+"\n"+getProizvoditel()+"\n"+"Matrissa:"+getTipMatrisa();


    }

}
