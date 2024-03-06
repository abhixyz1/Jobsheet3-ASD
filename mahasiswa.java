import java.util.Scanner;

public class mahasiswa {
    public Scanner sc = new Scanner(System.in);
    public String nama;
    public int NIM;
    public String jenisKelamin;
    public float IPK;
    public float totalRataIPK = 0;

    public mahasiswa() {
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("NIM: ");
        NIM = sc.nextInt();
        System.out.print("Jenis Kelamin: ");
        jenisKelamin = sc.next();
        System.out.print("IPK: ");
        IPK = sc.nextFloat();
    }
    float rataIPK(int jumlahSiswa, mahasiswa[] arrayMahasiswa) {
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            totalRataIPK += arrayMahasiswa[i].IPK;
        }
        return totalRataIPK / jumlahSiswa;
    }
}
