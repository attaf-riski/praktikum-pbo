// Nama File: Programmer.java
// Deskripsi: Tugas Praktikum Polimorfisme 
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 3 April 2023 

package pbo.polimorfisme.pegawai;

public class Programmer extends Pegawai {
    int bonus = 450000;
    Programmer(String nama){
        super.setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : "+bonus);
    }
}
