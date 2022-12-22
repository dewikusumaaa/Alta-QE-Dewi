package bangunruang;

public class App {
    public static void main(String[] args) {

        System.out.println("Volume");

        Kubus kubus = new Kubus();
        kubus.setSisi(10);
        System.out.println("Kubus = " + Math.round(kubus.hitungVolume()));

        Balok balok = new Balok();
        balok.setPanjang(3);
        balok.setLebar(6);
        balok.setTinggi(10);
        System.out.println("Balok = " + Math.round(balok.hitungVolume()));

        Tabung tabung = new Tabung();
        tabung.setJarijari(7);
        tabung.setTinggi(10);
        System.out.println("Tabung = " + Math.round(tabung.hitungVolume()));



    }
}

