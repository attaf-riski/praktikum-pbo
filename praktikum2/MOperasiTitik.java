// Nama File: MOperasiTitik.java
// Deskripsi: Menjalankan Operasi Titik
// Tanggal: Rabu, 1 Maret 2023
// Pembuat: Attaf Riski // 24060121120005


package praktikum2;

class OperasiTitik{
    private void refleksiSumbuX(Titik titik){
        float y = titik.getOrdinat();
        titik.setOrdinat((-1)*y);
    }

    private void refleksiSumbuY(Titik titik){
        float x = titik.getAbsis();
        titik.setAbsis((-1) * x);
    }

    public Titik refleksiX(Titik titik){
        Titik titikReturn = new Titik(titik.getAbsis(),titik.getOrdinat());
        refleksiSumbuX(titikReturn);
        return titikReturn;   
    }

    public Titik refleksiY(Titik titik){
        Titik titikReturn = new Titik(titik.getAbsis(),titik.getOrdinat());
        refleksiSumbuY(titikReturn);
        return titikReturn;   
    }

}

public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(4,4);
        System.out.printf("titik(%.1f,%.1f) \n",t1.getAbsis(),t1.getOrdinat());
        OperasiTitik op = new OperasiTitik();
        Titik refleksiX = op.refleksiX(t1);
        System.out.printf("titik baru refleksi X: titik(%.1f,%.1f) \n",refleksiX.getAbsis(),refleksiX.getOrdinat());
        Titik refleksiY = op.refleksiY(t1);
        System.out.printf("titik baru refleksi Y: titik(%.1f,%.1f) \n",refleksiY.getAbsis(),refleksiY.getOrdinat());

        

    }
}
