package ongkoskirim;

public class Barang {

    public double panjang, lebar, tinggi, berat;

    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return lebar;
    }
    public void setTinggi(double tinggi) {
        this.tinggi =  tinggi;
    }

    public double getBerat() {
        return berat;
    }
    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double Volume() {
        return (Math.ceil(panjang*lebar*tinggi/5000));
    }

    public double hitungHarga() {
        return berat * 5000 * Volume();
    }


}

