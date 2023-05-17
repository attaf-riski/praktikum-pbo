/*
 * Nama File: ArrayListTest.java
 * Deksripsi: Program Penggunaan Objek ArrayLIst sebagai Collection class
 * Pembuat: Attaf Riski Putra Ramadhan
 * Tanggal: 17 Mei 2023
 */

 import java.util.ArrayList;
import java.util.List;

 public class ArrayListTest{
    public static void main(String[] args){
        //inisialisasi ArrayList yang hanya dapat
        //berisi objek String
        List<String> strings = new ArrayList<>();
        //menambah elemen
        strings.add("Praktikum");
        strings.add("Collection");
        strings.add("And");
        strings.add("generics");
        //menghapus elemen
        strings.remove("Praktikum");
        //iterasi pada keseluruhan Arraylist
        printElmt(strings);
        printElmt2(strings);
    }

    static void printElmt(List<String> strings){
        System.out.println("Print menggunakan for each");
        for(String s: strings){
            System.out.println(s+" ");
        }
    }

    static void printElmt2(List<String> strings){
        System.out.println("Print menggunakan for index");
        for(int i=0;i<strings.size();i++){
            System.out.println(strings.get(i)+" ");
        }
    }
 }