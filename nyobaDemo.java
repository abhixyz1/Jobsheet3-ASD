public class nyobaDemo {
    public static void main(String[] args) {
        nyoba[] arrayOfNyoba = new nyoba[1];

        for (int i = 0; i < arrayOfNyoba.length; i++) {
            arrayOfNyoba[i] = new nyoba(); // Menggunakan konstruktor default
            arrayOfNyoba[i].cetakInfo(); // Memanggil metode cetakInfo()
            System.out.println(); // Untuk memberikan baris kosong antara setiap objek yang dicetak
        }
    }
}