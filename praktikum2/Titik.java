// Nama File: Titik.java
// Deskripsi: Kelas Titik
// Tanggal: Rabu, 1 Maret 2023
// Pembuat: Attaf Riski // 24060121120005

package praktikum2;

class Titik{
    private float absis;
    private float ordinat;

    // keanggotaan milik kelas
    private static int counterTitik;

    public Titik(){
        this.absis = 0;
        this.ordinat = 0;
        // mengakses keanggotan kelas
        Titik.counterTitik++;
    }

    // overloading
    public Titik(float a, float b){
        this.absis = a;
        this.ordinat = b;
        // mengakses keanggotan kelas
        Titik.counterTitik++;
    }

    public void setAbsis(float a){
        this.absis = a;
    }

    public void setOrdinat(float o){
        this.ordinat = o;
    }

    public float getAbsis(){
        return this.absis;
    }

    public float getOrdinat(){
        return this.ordinat;
    }

    // keanggotaan milik kelas
    public static int getCounterTitik(){
        return counterTitik;
    }
}

