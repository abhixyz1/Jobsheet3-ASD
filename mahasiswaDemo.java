import java.util.Scanner;

public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        mahasiswa[] arrayMahasiswa = new mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan Nama: ");
            String nama = sc.next();
            System.out.print("Masukkan NIM: ");
            int NIM = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin: ");
            String jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            float IPK = sc.nextFloat();
            System.out.println();

            arrayMahasiswa[i] = new mahasiswa(nama, NIM, jenisKelamin, IPK);
        }
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayMahasiswa[i].cetakInfo();
            System.out.println();
        }
        float total = 0;
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            total += arrayMahasiswa[i].IPK;
        }
        float rataRata = total / arrayMahasiswa.length;
        System.out.println("Rata-rata IPK: " + rataRata);
    }
}
