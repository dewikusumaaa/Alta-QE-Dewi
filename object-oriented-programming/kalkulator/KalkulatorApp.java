package kalkulator;

public class KalkulatorApp {

    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setBilangan1(3);
        kalkulator.setBilangan2(4);
        System.out.println("Penjumlahan = " + kalkulator.hitungPenjumlahan());

        kalkulator.setBilangan1(15);
        kalkulator.setBilangan2(4);
        System.out.println("Pengurangan = " + kalkulator.hitungPengurangan());

        kalkulator.setBilangan1(10);
        kalkulator.setBilangan2(10);
        System.out.println("Perkalian = " + kalkulator.hitungPerkalian());

        kalkulator.setBilangan1(12);
        kalkulator.setBilangan2(3);
        System.out.println("Pembagian = " + kalkulator.hitungPembagian());
    }
}
