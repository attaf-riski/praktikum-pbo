/*
 * Nama File: BangunDatarGeneric.java
 * Deksripsi: Kelas konstruksi generic untuk BangunDatar
 * Pembuat: Attaf Riski Putra Ramadhan
 * Tanggal: 17 Mei 2023
 */


public class BangunDatarGeneric<Tipe extends BangunDatar> {
    // dengan mengganti 'T' menjadi 'Tipe' menyebakan seluruh nama kelas yang menggunakan T diganti menjadi Tipe
    // Tipe hanyalah nama sehingga dapat diganti asalkan tidak melanggar aturan java seperti menggunakan nama reserve words
    // Disini Tipe akan digunakan di seluruh komponene Kelas BangunDatarGenerics

    private Tipe bangunDatar;

    public void set(Tipe tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public Tipe get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

}
