import java.util.Scanner;

public class belitiketDemo {
    public static int jumlahTiket;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("| Selamat Datang di Aplikasi Pembelian Tiket |");
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah Penumpang : ");
        int jumlahPenumpang = sc.nextInt();
        
        belitiket[] arrayBelitiket = new belitiket[jumlahPenumpang];

        for (int i = 0; i < arrayBelitiket.length; i++) {
            System.out.println("\nData Penumpang ke-" + (i + 1));
            System.out.print("Masukkan Nama\t\t: ");
            String nama = sc.next();
            System.out.print("Masukkan Umur\t\t: ");
            int umur = sc.nextInt();
            System.out.print("Masukkan Asal Kota\t: ");
            String asalKota = sc.next();
            System.out.print("Masukkan Tujuan Kota\t: ");
            String tujuanKota = sc.next();
            System.out.print("Masukkan Jenis Tiket\t: ");
            String jenisTiket = sc.next();
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            jumlahTiket = sc.nextInt();
            System.out.println();

            arrayBelitiket[i] = new belitiket(nama, umur, asalKota, tujuanKota, jenisTiket);
        }
        for (int i = 0; i < arrayBelitiket.length; i++) {
            System.out.println("=====================================");
            System.out.println("| Data Penumpang ke-" + (i + 1) + "\t\t    |");
            arrayBelitiket[i].cetakInfo();
            System.out.println();
        }
    }
}
