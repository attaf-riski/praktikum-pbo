// Nama File: AngkaSial.java
// Deskripsi: Ada hadist marfu mengatakan “Beranggapan sial adalah kesyirikan, beranggapan sial adalah kesyirikan” jadi waspadah-waspadalah
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Ahad, 2 April 2023 

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ex){
            //
            System.out.println(ex.getMessage());
            System.out.println("Hati-hati pada hati!");
        }
    }
}

// Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// Tidak
// Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Iya


