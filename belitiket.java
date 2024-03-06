public class belitiket {
    public String nama;
    public int umur;
    public String asalKota;
    public String tujuanKota;
    public String jenisTiket;
    public static int jumlahTiket;

    public belitiket(String n, int u, String ak, String tk, String jt) {
        nama = n;
        umur = u;
        asalKota = ak;
        tujuanKota = tk;
        jenisTiket = jt;
    }

    int hitungHarga() {
        int harga = 0;
        if (jenisTiket.equalsIgnoreCase("Ekonomi")) {
            harga = 100000;
        } else if (jenisTiket.equalsIgnoreCase("Bisnis")) {
            harga = 200000;
        } else if (jenisTiket.equalsIgnoreCase("Eksekutif")) {
            harga = 300000;
        }
        return harga;
    }
    int totalHarga() {
        return hitungHarga() * belitiketDemo.jumlahTiket;
    }

    void cetakInfo() {
        System.out.println("=====================================");
        System.out.println("| Nama\t\t\t: " + nama);
        System.out.println("| Umur\t\t\t: " + umur);
        System.out.println("| Asal Kota\t\t: " + asalKota);
        System.out.println("| Tujuan Kota\t\t: " + tujuanKota);
        System.out.println("| Jenis Tiket\t\t: " + jenisTiket);
        System.out.println("| Jumlah tiket\t\t: "+ belitiketDemo.jumlahTiket);
        System.out.println("| Total Harga\t\t: " + totalHarga());
        System.out.println("=====================================");
    }
    
}


