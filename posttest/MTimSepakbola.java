// Nama File: MTimSepakbola.java
// Deskripsi: Post test
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 15 Maret 2023 

// Asumsi yang ditambahkan
// 1. karena sudah belajar materi enkapsulasi pada materi ke-2, maka dibuat function getNama()


class MTimSepakbola {
  public static void main(String[] args) {
    // TODO: Make an instance called 'liverpool' -> use constructor which you have made before
    TimSepakbola liverpool = new TimSepakbola("Liverpool");
    // TODO: Make an instance called 'manchesterUnited' -> use constructor which you have made before
    TimSepakbola manchesterUnited = new TimSepakbola("Manchester United");

    // TODO: call startTandingBola()
    liverpool.startTandingBola(manchesterUnited);
		

		// Assume that liverpool wins against manchesterUnited 7 - 0
    for (int i = 0; i < 7; i++) {
  		liverpool.goal();

			// TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
			// Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
			System.out.println("Skor sementara: " + liverpool.getNama() + " " + liverpool.getSkor() + " - " + manchesterUnited.getSkor() + " " + manchesterUnited.getNama());
    }

		// TODO: call endTandingBola()
    liverpool.endTandingBola(manchesterUnited);
		
  }
}

/* 
Expected output:

Pertandingan antara Liverpool dan Manchester United dimulai!

Skor sementara: Liverpool 1 - 0 Manchester United
Skor sementara: Liverpool 2 - 0 Manchester United
Skor sementara: Liverpool 3 - 0 Manchester United
Skor sementara: Liverpool 4 - 0 Manchester United
Skor sementara: Liverpool 5 - 0 Manchester United
Skor sementara: Liverpool 6 - 0 Manchester United
Skor sementara: Liverpool 7 - 0 Manchester United

Pertandingan antara Manchester United dan Liverpool selesai!
*/
