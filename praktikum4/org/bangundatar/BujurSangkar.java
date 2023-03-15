// Nama File: BujurSangkar.java
// Deskripsi: bujursangkar
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Selasa, 14 Maret 2023 

package org.bangundatar;

import org.poligon.*;

public class BujurSangkar extends Poligon {
    // KAMUS
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        super();
        super.setJumlahSisi(4);
        this.panjangSisi = panjangSisi;
    }

    // MUTATOR

    // SELEKTOR
    public double hitungLuas(){
        return this.panjangSisi*this.panjangSisi;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }
}
