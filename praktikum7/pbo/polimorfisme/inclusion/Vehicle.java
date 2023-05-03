// Nama File: Vehicle.java
// Deskripsi: Praktikum Polimorfisme 
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 3 April 2023 

package pbo.polimorfisme.inclusion;

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance*price;
        System.out.println("Vehicle price ="+fare);
    }    
}
