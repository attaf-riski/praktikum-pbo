// Nama File: Pegawai.java
// Deskripsi: Tugas Praktikum Polimorfisme 
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 3 April 2023 

package pbo.polimorfisme.pegawai;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData(){
        System.out.printf("Nama : %s, Gaji pokok : %d \n",nama,gajiPokok);
    }

}
