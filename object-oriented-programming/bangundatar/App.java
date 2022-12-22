package bangundatar;

public class App {
    public static void main(String[] args) {

        System.out.println("Luas");
        Persegi persegi = new Persegi();
        persegi.setSisi(4);
        System.out.println("Persegi = " + Math.round(persegi.hitungluas()));

        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.setPanjang(7);
        persegipanjang.setLebar(8);
        System.out.println("Persegi Panjang = " + Math.round(persegipanjang.hitungLuas()));

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(3);
        segitiga.setTinggi(4);
        System.out.println("Segitiga = " + Math.round(segitiga.hitungLuas()));
        System.out.println("\n");

        System.out.println("Keliling");
        persegi.setSisi(4);
        System.out.println("Persegi = " + Math.round(persegi.hitungkeliling()));

        persegipanjang.setPanjang(7);
        persegipanjang.setLebar(8);
        System.out.println("Persegi Panjang = " + Math.round(persegipanjang.hitungKeliling()));

        segitiga.setAlas(3);
        segitiga.setTinggi(4);
        System.out.println("Segitiga = " + Math.round(segitiga.hitungKeliling()));
    }
}



