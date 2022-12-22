package bangundatar;

public class Segitiga {

    public int alas;
    public int tinggi;


    public int getAlas() {
        return alas;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double sisiMiring(int alas, int tinggi) {
        return Math.sqrt((alas * tinggi) + (tinggi * tinggi));

    }
    public double hitungLuas() {
        return (0.5 * alas * tinggi);
    }

    public double hitungKeliling() {
        return (alas + tinggi + sisiMiring(alas, tinggi));
    }

}




//    public double luas(double s1, double s2) {
//         return (0.5 * s1 * s2);
//    }
//    public double keliling(double s1, double s2) {
//         return(s1 + s2 + sisiMiring(s1, s2));
//    }
//
//    public double sisiMiring(double s1, double s2) {
//         return Math.sqrt((s1 * s2) + (s2 * s2));
//    }
//}
