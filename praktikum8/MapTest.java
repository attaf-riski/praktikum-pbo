/*
 * Nama File: MapTest.java
 * Deksripsi: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * Pembuat: Attaf Riski Putra Ramadhan
 * Tanggal: 17 Mei 2023
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
  public static void main(String[] args) {
      //kunci: integer, nilai: String
    Map<Integer,String> map = new HashMap<Integer,String>();
    //menempatkan elemen kunci dan nilai
    map.put(1,"Satu");
    map.put(2,"Dua");
    //mengambil elemen pertama
    System.out.println(map.get(1));
    //mengambil keseluruhan kunci sebagai objek collection Set
    Set<Integer> key = map.keySet();  
    // bagaiman iterasi untuk mengambil keseluruhan 
    // nilai dari kunci? tulis pada laporan anda!
    // petunjuk: gunakan iterasi seperti program ArrayListTest
    for(Integer k: key){
      System.out.println(k);
    }
  }
}
