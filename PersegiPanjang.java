public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }
    int hitungLuas() {
        return panjang * lebar;
    }
    int hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    String cetakInfo() {
        return "Panjang: " + panjang + ", Lebar: " + lebar + ", Luas: " + hitungLuas() + ", Keliling: " + hitungKeliling();
    }
}

