package ongkoskirim;

public class OngkosKirim {

    public static void main(String[] args) {

        Barang barang = new Barang();

        barang.setPanjang(5);
        barang.setLebar(2);
        barang.setTinggi(4);
        barang.setBerat(1);
        System.out.println("Harga = " + Math.round(barang.hitungHarga()));
    }
}
