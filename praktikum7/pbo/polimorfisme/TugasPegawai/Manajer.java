// Nama File: Manajer.java
// Deskripsi: Tugas Praktikum Polimorfisme 
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 3 April 2023 

package pbo.polimorfisme.pegawai;

public class Manajer extends Pegawai {
    private int tunjangan = 700000;
    public Manajer(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : "+tunjangan);
    }
}
