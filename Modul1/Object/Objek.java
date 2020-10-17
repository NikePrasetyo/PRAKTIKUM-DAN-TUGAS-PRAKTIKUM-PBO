package com.nike.modul1.Object;

//class main
public class Objek {
    public static void main(String[] args) {
        //deklarasi tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();
        mahasiswaTanpa.setNama("Nike");
        mahasiswaTanpa.setNim(19104068);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t : " + mahasiswaTanpa.getNama());
        System.out.println("NIM\t\t : " + mahasiswaTanpa.getNim());

        //deklarasi dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 19104069);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t : " + mahasiswa.getNama());
        System.out.println("NIM\t\t : " + mahasiswa.getNim());
    }

}