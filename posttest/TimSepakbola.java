// Nama File: TimSepakbola.java
// Deskripsi: Post test
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Rabu, 15 Maret 2023 

// Asumsi yang ditambahkan
// 1. karena sudah belajar materi enkapsulasi pada materi ke-2, maka dibuat function getNama()

class TimSepakbola {

  // Assume there are only 2 teams using this class!

  // Attribute
  private String nama;
  private int skor;
  private boolean isOnMatch;

  // Default constructor
  public TimSepakbola() {
    nama = "[NAMA]";
    skor = 0;
    isOnMatch = false;
  }

   // TimSepakbola(nama: string)
  // TODO: Create an overloading constructor below this comment
  // isi semua
  public TimSepakbola(String nama, int skor, boolean isOnMatch){
    this.nama = nama;
    this.skor = skor;
    this.isOnMatch = isOnMatch;
  }

  // cukup kasi nama
  public TimSepakbola(String nama){
    this.nama = nama;
    skor = 0;
    isOnMatch = false;
  }

  // TODO: Fix the method below
  // Replace [TIM 1] and [TIM 2] with the correct attribute
  // [TIM 1] and [TIM 2] are commutative, so you don't need to worry if [TIM 1] or [TIM 2] refer to either this class or 'lawan'
  public void startTandingBola(TimSepakbola lawan) {
    // DO NOT change both if conditions
    if (Boolean.TRUE.equals(this.isOnMatch)) {
      System.out.println("Tim " + lawan.nama + " sedang dalam pertandingan!");
      return;
    }

    if (Boolean.TRUE.equals(lawan.isOnMatch)) {
      System.out.println("Lawan sedang dalam pertandingan!");
      return;
    }

    System.out.println("Pertandingan antara " + this.nama + " dan " + lawan.nama + " dimulai!\n"
    );
    this.setIsOnMatch(true);
    lawan.setIsOnMatch(true);
  }

  // TODO: Implement goal() method. Skor will be added by 1 for every single goal from the team
  public void goal() {
    // DO NOT change the if condition
    if (Boolean.FALSE.equals(this.isOnMatch)) {
      System.out.println(
        "Tim " + this.nama + " TIDAK sedang dalam pertandingan!"
      );
      return;
    }
    this.skor++;
  }

  // TODO: Implement getSkor() method. This is a selector to get the score for a team
  public int getSkor() {
    // DO NOT change the if condition
    if (Boolean.FALSE.equals(this.isOnMatch)) {
      System.out.println(
        "Tim " + this.nama + " TIDAK sedang dalam pertandingan!"
      );
      return 0;
    }

    // kembalikan skor terkini
    return this.skor;

  }

  // TODO: Implement setIsOnMatch() method. This is a mutator to set a new boolean value for isOnMatch
  public void setIsOnMatch(boolean onMatch) {
    this.isOnMatch = onMatch;
  }
  

  // TODO: Fix the method below. This method below is quite similar with startTandingBola()
  // Replace [TIM 1] and [TIM 2] with the correct attribute
  // [TIM 1] and [TIM 2] are commutative, so you don't need to worry if [TIM 1] or [TIM 2] refer to either this class or 'lawan'
  public void endTandingBola(TimSepakbola lawan) {
    // DO NOT change the if condition
    if (
      Boolean.FALSE.equals(this.isOnMatch) &&
      Boolean.FALSE.equals(lawan.isOnMatch)
    ) {
      System.out.println("Kedua tim TIDAK sedang dalam pertandingan");
      return;
    }

    System.out.println(
      "\nPertandingan antara " +
      this.nama +
      " dan " +
      lawan.nama +
      " selesai!\n"
    );
    this.setIsOnMatch(false);
    lawan.setIsOnMatch(false);
  }

  // method tambahan peserta praktikum (attaf) sendiri
  public String getNama(){
    return this.nama;
  }
}
