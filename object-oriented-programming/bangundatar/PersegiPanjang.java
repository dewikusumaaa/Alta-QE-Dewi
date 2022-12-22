package bangundatar;

public class PersegiPanjang {
    public float panjang;
    public float lebar;

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }
    public float getLebar() {
        return lebar;
    }
    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float hitungLuas() {
        return panjang*lebar;
    }
    public float hitungKeliling() {
        return (2*panjang) + (2*lebar);
    }
}

