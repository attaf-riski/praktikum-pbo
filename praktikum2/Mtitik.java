// Nama File: Mtitik.java
// Deskripsi: Menjalankan Titik
// Tanggal: Rabu, 1 Maret 2023
// Pembuat: Attaf Riski // 24060121120005

package praktikum2;
class Mtitik{
    public static void main(String[] args) {
        // Membuat objek dengan Konstruktor tanpa parameter
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);
        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        // Membuat objek dengan Konsruktor t
        Titik t3 = new Titik(5,6);
        
        // Memanggil 
        System.out.println("Jumlah objek titik: "+Titik.getCounterTitik());
        System.out.println("t1("+t1.getAbsis()+","+t1.getOrdinat()+")");
        System.out.println("t2("+t2.getAbsis()+","+t2.getOrdinat()+")");
        System.out.println("t2("+t3.getAbsis()+","+t3.getOrdinat()+")");
    }
}