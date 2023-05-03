// Nama File: Car.java
// Deskripsi: Praktikum Polimorfisme 
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 3 April 2023 

package pbo.polimorfisme.inclusion;

public class Car extends Vehicle {
    @Override
    void calRent(int jarak, float harga){
        super.calRent(jarak, harga);
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil ="+fare);
    }
}
