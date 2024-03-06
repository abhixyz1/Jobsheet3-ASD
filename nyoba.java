public class nyoba {
    public int permintaanTahun = 1000;
    public double biayaPemesanan = 10;
    public double biayaPenyimpanan = 0.5;
    public int hariKerja = 250;

    // Konstruktor tidak diperlukan karena variabel kelas sudah diinisialisasi dengan nilai default.

    double hitungEOQ() {
        return Math.sqrt((2 * permintaanTahun * biayaPemesanan) / biayaPenyimpanan);
    }

    void cetakInfo() {
        System.out.println("Permintaan Tahun: " + permintaanTahun);
        System.out.println("Biaya Pemesanan: " + biayaPemesanan);
        System.out.println("Biaya Penyimpanan: " + biayaPenyimpanan);
        System.out.println("Hari Kerja: " + hariKerja);
        System.out.println("EOQ: " + hitungEOQ());
    }
}