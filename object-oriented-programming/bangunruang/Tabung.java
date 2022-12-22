package bangunruang;

public class Tabung {
    public double tinggi, jarijari;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double hitungVolume() {
        return 3.14285714286 * jarijari * jarijari * tinggi;

    }
}


