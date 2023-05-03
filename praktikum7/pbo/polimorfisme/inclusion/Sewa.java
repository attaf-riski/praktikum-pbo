// Nama File: Sewa.java
// Deskripsi: Praktikum Polimorfisme 
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 3 April 2023 

package pbo.polimorfisme.inclusion;

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}
