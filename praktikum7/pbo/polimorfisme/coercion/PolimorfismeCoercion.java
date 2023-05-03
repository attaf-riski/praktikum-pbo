// Nama File: PolimorfismeCoercion.java
// Deskripsi: Praktikum Polimorfisme 
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 3 April 2023 

package pbo.polimorfisme.coercion;

public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }
    public static void main(String[] args) {
        // deklarasi objek integer
        Integer bilangan = 10;
        
        //objek integer 'dipaksa' untuk diubah
        //menjadi primitif
        int hasilKuadrat = kuadrat(bilangan);
        System.out.printf("Hasil kuadrat %d adalah %d",bilangan,hasilKuadrat);
    }   
}