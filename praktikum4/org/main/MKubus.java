// Nama File: MKubus.java
// Deskripsi: penjalan kubus
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 15 Maret 2023 

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

class MKubus{
    public static void main(String[] args) {
        // KAMUS LOKAL
        BujurSangkar permukaanKubus = new BujurSangkar(4);
        Kubus kubusSatu = new Kubus(permukaanKubus);

        // ALGORITMA
        // tentukan volume kubus
        System.out.printf("Volume kubus: %f\n",kubusSatu.hitungVolume());
        // tentukan luas alas kubus
        System.out.printf("Luas alas kubus: %f\n",kubusSatu.hitungLuasAlas());
    }
}