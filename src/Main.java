public class Main {
    public static void main(String[] args) {


        Komputer komputer = new Komputer("M7600,AMD Ruzen 5000 Series:  ", "Vivobook Pro ",
                "bleak", "da ");

        System.out.println(komputer.getInfo());
        System.out.println("****************************************************");
        SSD ssd = new SSD(15, "MX150", "512 QS SSD", "15L");

        System.out.println(ssd.getinfo());
        System.out.println("*****************************************************");
        Displei displei = new Displei("15 ", "ASUSTEK", "X555,X570");
        System.out.println(displei.getinfo());
        System.out.println("****************************************************");
        OperativnyiPamiyat operativnyiPamiyat = new OperativnyiPamiyat(4, "ASUS");
        System.out.println(operativnyiPamiyat.getinfo());
        System.out.println("**************************************************");
        USBpotr usBpotr = new USBpotr(2, "USB a,b");
        System.out.println(usBpotr.getinfo());
    }


}
