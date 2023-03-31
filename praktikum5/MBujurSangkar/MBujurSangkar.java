// Nama File: MBujurSangkar.java
// Deskripsi: sangkar
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Jumat, 31 Maret 2023 

import java.util.Scanner;

class MBujurSangkar{
   public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         BujurSangkar bs = new BujurSangkar();
         System.out.print("Masukkan sisi bujur sangkar: ");
         double sisi = scan.nextDouble();
         System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
   }
}
//Praktekkan: apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada BangunDatar? jelaskan ?

//Jika kelas "BujurSangkar" tidak membuat implementasi metode abstrak yang ada pada kelas induknya "BangunDatar",
//maka kelas "BujurSangkar" juga harus menjadi kelas abstrak, karena itu berarti bahwa kelas tersebut tidak menyediakan 
//implementasi lengkap dari metode abstrak pada kelas induknya.Selain itu, kelas yang menggunakan kelas "BujurSangkar" tidak dapat menginstansiasi
//objek dari kelas "BujurSangkar" karena itu merupakan kelas abstrak dan tidak dapat digunakan untuk membuat objek.
//Oleh karena itu, kelas "BujurSangkar" harus membuat implementasi dari semua metode abstrak yang ada pada kelas induknya
//agar dapat diinstansiasi dan digunakan oleh kelas lain yang menggunakannya.
   
