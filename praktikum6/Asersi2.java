// Nama File : Asersi2.java
// Deskripsi : Menunjukan program assert
// Pembuat : Attaf Riski Putra Ramadhan
// Tanggal : Minggu, 2 April 2023

// class lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class asersi2
public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"Jari-jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkarang = "+kelilingLingkaran);
    }
}

// Secara konsep, ada yang kurang tepat pada program Asersi2 di atas
// Ada dua hal yang perlu diperbaiki yaitu nilai jariJari harus lebih dari 0, karena program akan berhenti selalu pada assert
// hal kedua adalah penamaan assert harus jelas, misal diberi kode-kode unik