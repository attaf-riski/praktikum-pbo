// File: MPoligon.java
// Penulis: Attaf riski Putra Ramadhan
// Deskripsi: drier clas untuk poligon dan persegi panjang
// Tanggal: Rabu, 6 Maret 2023


package org.main;

import org.bangundatar.*;

public class MPoligon { 
    public static void main(String[] args) {
        // Perssegi
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: "+persegi.hitungLuas());

        // Segitiga
        Segitiga segitiga = new Segitiga(7, 5, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga: "+segitiga.hitungLuas());
 
    }
}
