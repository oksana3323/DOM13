public class SSD {
    public int operativnayaPamyat;
    private String videoCarta;
    private String USBporty;
    private String klaviyatura;

    public SSD(int operativnayaPamyat, String videoCarta, String USBporty, String klaviyatura) {
        this.klaviyatura = klaviyatura;
        this.videoCarta = videoCarta;
        this.USBporty = USBporty;
        this.klaviyatura = klaviyatura;
    }


    public void setOperativnayaPamyat(int operativnayaPamyat) {
        this.operativnayaPamyat = operativnayaPamyat;
    }

    public void setVideoCarta(String videoCarta) {
        this.videoCarta = videoCarta;
    }

    public void setUSBporty(String USBporty) {
        this.USBporty = USBporty;
    }

    public void setKlaviyatura(String klaviyatura) {
        this.klaviyatura = klaviyatura;
    }

    public int getOperativnayaPamyat() {
        return operativnayaPamyat;
    }

    public String getVideoCarta() {
        return videoCarta;
    }

    public String getUSBporty() {
        return USBporty;
    }

    public String getKlaviyatura() {
        return klaviyatura;
    }

    public String getinfo() {
        return "Operativnaya pamyat :" + getOperativnayaPamyat() + "\n" + "VideoCart :" + getVideoCarta() + "\n" + "USB:" + getUSBporty()
                + "\n" + "Klaviyatura:" + getKlaviyatura();
    }


}
