// Nama File: Titik.java
// Deskripsi: Kelas Titik
// Tanggal: Rabu, 22 Feb 2022
// Pembuat: Attaf Riski // 24060121120005

package praktikum1;

class Titik{
    private double absis;
    private double ordinat;

    // keanggotaan milik kelas
    private static int counterTitik;

    Titik(){
        this.absis = 0.0;
        this.ordinat = 0.0;
        // mengakses keanggotan kelas
        Titik.counterTitik++;
    }

    // overloading
    Titik(double a, double b){
        this.absis = a;
        this.ordinat = b;
        // mengakses keanggotan kelas
        Titik.counterTitik++;
    }

    void setAbsis(double a){
        this.absis = a;
    }

    void setOrdinat(double o){
        this.ordinat = o;
    }

    double getAbsis(){
        return this.absis;
    }

    double getOrdinat(){
        return this.ordinat;
    }

    // keanggotaan milik kelas
    static int getCounterTitik(){
        return counterTitik;
    }
}