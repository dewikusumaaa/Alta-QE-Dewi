package kalkulator;

public class Kalkulator {

    public int bilangan1, bilangan2;

    public int getBilangan1() {
        return bilangan1;
    }

    public void setBilangan1(int bilangan1) {
        this.bilangan1 = bilangan1;
    }

    public int getBilangan2() {
        return bilangan2;
    }

    public void setBilangan2(int bilangan2) {
        this.bilangan2 = bilangan2;
    }

    public int hitungPenjumlahan() {
        return bilangan1 + bilangan2;
    }

    public int hitungPengurangan() {
        return bilangan1 - bilangan2;
    }

    public int hitungPerkalian() {
        return bilangan1 * bilangan2;
    }

    public int hitungPembagian() {
        return bilangan1 / bilangan2;
    }
}

