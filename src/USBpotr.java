public class USBpotr {
private double tipPorta;
  private String porta;

  public USBpotr(double tipPorta, String porta) {

    this.tipPorta = tipPorta;
    this.porta = porta;
  }

  public void setTipPorta(double tipPorta) {
    this.tipPorta = tipPorta;
  }

  public void setPorta(String porta) {
    this.porta = porta;
  }

  public double getTipPorta() {
    return tipPorta;
  }

  public String getPorta() {
    return porta;
  }
public String getinfo(){
    return "getPorta"+getTipPorta()+"\n"+"porta"+getPorta();
}

}
