// Nama File: PegawaiDanGaji.java
// Deskripsi: Tugas Praktikum Polimorfisme 
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 3 April 2023 

package pbo.polimorfisme.pegawai;

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai1 = new Manajer("Joko");
        Pegawai pegawai2 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);

    }    
}
