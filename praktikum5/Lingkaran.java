// Nama File: Lingkaran.java
// Deskripsi: Kelas implementasi IArea berupa cara menghitung luas lingkaran
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Sabtu, 25 Maret 2023 

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
    private double jejari;
    public Lingkaran(double r){
        this.jejari = r;
    }
    @Override
    public double hitungLuas() {
        return PI*jejari*jejari;
    }
}
