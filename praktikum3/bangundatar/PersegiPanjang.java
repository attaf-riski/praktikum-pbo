// File: PersegiPanjang.java
// Penulis: Attaf riski Putra Ramadhan
// Deskripsi: Representasi dasar dari objek persegi panjang turunan kelas poligon
// Tanggal: Rabu, 6 Maret 2023


package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang,lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang*lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi "+this.getJumlahSisi());
    }
}
