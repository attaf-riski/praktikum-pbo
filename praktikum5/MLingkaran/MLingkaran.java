import java.util.Scanner;

// Nama File: MLingkaran.java
// Deskripsi: Implementasi cara menghitung luas lingkaran
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Sabtu, 25 Maret 2023 

public class MLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jejari lingkaran: ");
        double jejari = sc.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.printf("Luas lingkaran dengan jejari %f satuan adalah %f \n",jejari,l.hitungLuas());
        sc.close();
    }
}
