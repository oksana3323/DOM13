public class Komputer {
    private String displei;
    private String marka;
    private String color;
    private String klaviatura;

    public Komputer(String displei, String marka, String color, String klaviatura) {
        this.displei = displei;
        this.marka = marka;
        this.color = color;
        this.klaviatura = klaviatura;
    }

    public void setDisplei(String displei) {
        this.displei = displei;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKlaviatura(String klaviatura) {
        this.klaviatura = klaviatura;
    }

    public String getDisplei() {
        return displei;
    }

    public String getMarka() {
        return marka;
    }

    public String getColor() {
        return color;

    }

    public String getKlaviatura() {
        return klaviatura;
    }

    public String getInfo() {
        return "Displei:" + getDisplei() + "\n" + "marka:" + getMarka() + "\n" + "Color " + getColor() + "\n" + "Klaviatura  :" + getKlaviatura();
    }
}
