// Nama File: Mtitik.java
// Deskripsi: Menjalankan Titik
// Tanggal: Rabu, 22 Feb 2022
// Pembuat: Attaf Riski // 24060121120005

package praktikum1;
class Mtitik{
    public static void main(String[] args) {
        // Membuat objek dengan Konstruktor tanpa parameter
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2.0);
        Titik t2 = new Titik();
        t2.setAbsis(3.0);
        t2.setOrdinat(4.0);

        // Membuat objek dengan Konsruktor t
        Titik t3 = new Titik(5.0,6.0);
        
        // Memanggil
        System.out.println("Jumlah objek titik: "+Titik.getCounterTitik());
        System.out.println("t1("+t1.getAbsis()+","+t1.getOrdinat()+")");
        System.out.println("t2("+t2.getAbsis()+","+t2.getOrdinat()+")");
        System.out.println("t2("+t3.getAbsis()+","+t3.getOrdinat()+")");
    }
}