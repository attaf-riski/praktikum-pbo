package lambda;

// File : LambdaHashmap.java
// Deskripsi: Tugas praktikum 10
// Pembuat: Attaf Riski Putra Ramadhan / 24060121120005
// Tanggal: Kamis, 1 Juni 2023

import java.util.Map;
import java.util.HashMap;

public class LambdaHashmap {

    public static void main(String[] args) {
        // KAMUS LOKAL
        Map<String, String> daftarMahasiswa = new HashMap<>();
        daftarMahasiswa.put("24060121120016", "Dhiya Indah Fatikasari");
        daftarMahasiswa.put("24060121140104", "Divia Shinta Sukarsaatmadja");
        daftarMahasiswa.put("24060121120032", "Laily Novita Sari");
        daftarMahasiswa.put("24060121130969", "Ririn Indah Cahyani");
        daftarMahasiswa.put("24060121120038", "Abigail Metanoia Melody");
        daftarMahasiswa.put("24060121140115", "Faizal Husain Adiasha");
        daftarMahasiswa.put("24060121130067", "Firdaus Ravi Faizzani");

        // ALGORITMA
        daftarMahasiswa.forEach((key, value) -> {
            System.out.println("Nim: " + key + ", Nama: " + value);
        });

    }
}
