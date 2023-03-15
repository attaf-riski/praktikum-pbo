// Nama File: Main.java
// Deskripsi: Poligon
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Selasa, 14 Maret 2023 

package org.poligon;

public class Poligon{
    // KAMUS
    protected int jumlahSisi;

    public Poligon(){
        this.jumlahSisi = 0;
    }

    // MUTATOR
    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    // SELEKTOR
    public int getJumlahSisi(){
        return this.jumlahSisi;
    }


}