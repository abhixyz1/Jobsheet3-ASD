import java.util.Scanner;
public class mahasiswaDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.println("=====================================");
        mahasiswa[] arrayMahasiswa = new mahasiswa[jumlahSiswa];
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            arrayMahasiswa[i] = new mahasiswa();
        }
        System.out.println("=====================================");
        System.out.println("Rata-rata IPK: " + arrayMahasiswa[0].rataIPK(jumlahSiswa, arrayMahasiswa));
        System.out.println("=====================================");
    }

}
