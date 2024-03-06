public class mahasiswa {
    
    public String nama;
    public int NIM;
    public String jenisKelamin;
    public float IPK;
    public float totalRataIPK = 0; 
    public mahasiswa[] arrayMahasiswa;

    public mahasiswa(String n, int ni, String jk, float ipk) {
        nama = n;
        NIM = ni;
        jenisKelamin = jk;
        IPK = ipk;
    }

    void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + IPK);
    }
    float hitungRataIPK() {
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            totalRataIPK += arrayMahasiswa[i].IPK;
        }
        return totalRataIPK / arrayMahasiswa.length;
    }
} 
