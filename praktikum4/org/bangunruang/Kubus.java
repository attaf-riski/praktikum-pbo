// Nama File: Kubus.java
// Deskripsi: kubus
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 15 Maret 2023 

package org.bangunruang;

import org.bangundatar.*;

public class Kubus {
    // KAMUS LOKAL
    private BujurSangkar permukaan;
    // PUBLIC
    public Kubus(BujurSangkar x){
        this.permukaan = x;
    }

    public Kubus(){}
    
    public double hitungVolume(){
        if(permukaan!=null){
            return this.permukaan.getPanjangSisi()*this.permukaan.getPanjangSisi()*this.permukaan.getPanjangSisi();
        }else{
            return 0.0;
        }
    }

    public double hitungLuasAlas(){
        if(permukaan!=null){
            return this.permukaan.hitungLuas();
        }else{
            return 0.0;
        }
    }

}
