/*
 * Nama File: Lingkaran.java
 * Deksripsi: Implementasi Lingkaran sebagai BangunDatar
 * Pembuat: Attaf Riski Putra Ramadhan
 * Tanggal: 17 Mei 2023
 */


public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    @Override
    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
    
}
