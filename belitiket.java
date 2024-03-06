import java.util.Scanner;

public class belitiket {
    public String nama;
    public int umur;
    public String asalKota;
    public String tujuanKota;
    public String jenisTiket;
    public int jumlahTiket;

    Scanner sc = new Scanner(System.in);

    public belitiket(String n, int u, String ak, String tk, String jt) {
        nama = n;
        umur = u;
        asalKota = ak;
        tujuanKota = tk;
        jenisTiket = jt;
    }
    public belitiket(){
        System.out.println("=====================================");
        System.out.print("Masukkan Nama\t\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Umur\t\t: ");
        umur = sc.nextInt();
        System.out.print("Masukkan Asal Kota\t: ");
        asalKota = sc.next();
        System.out.print("Masukkan Tujuan Kota\t: ");
        tujuanKota = sc.next();
        System.out.print("Masukkan Jenis Tiket\t: ");
        jenisTiket = sc.next();
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        jumlahTiket = sc.nextInt();
    }

    public int totalHarga() {
        int harga = 0;
        if (jenisTiket.equalsIgnoreCase("ekonomi")) {
            harga = 100000;
        } else if (jenisTiket.equalsIgnoreCase("bisnis")) {
            harga = 200000;
        } else if (jenisTiket.equalsIgnoreCase("executive")) {
            harga = 300000;
        }
        return harga * jumlahTiket;
    }

    void cetakInfo() {
        System.out.println("=====================================");
        System.out.println("| Nama\t\t\t: " + nama);
        System.out.println("| Umur\t\t\t: " + umur);
        System.out.println("| Asal Kota\t\t: " + asalKota);
        System.out.println("| Tujuan Kota\t\t: " + tujuanKota);
        System.out.println("| Jenis Tiket\t\t: " + jenisTiket);
        System.out.println("| Jumlah tiket\t\t: "+ jumlahTiket);
        System.out.println("| Total Harga\t\t: " + totalHarga());
        System.out.println("=====================================");
    }
    
}


