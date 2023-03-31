// Nama File: BangunDatar.java
// Deskripsi: bangun grak
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Jumat, 31 Maret 2023 

public abstract class BangunDatar{
    protected double luas;
    public abstract double hitungLuas(double sisi);
    public void setLuas(double l){
          luas=l;
    }
    public double getLuas(){
          return luas;
    }
}
