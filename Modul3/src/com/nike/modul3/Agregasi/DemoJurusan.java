package com.nike.modul3.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("19104014", "Software Engineering");

        Mahasiswa mahasiswa1 = new Mahasiswa("Naruto\t", 19104025);
        Mahasiswa mahasiswa2 = new Mahasiswa("Sasuke\t", 19104045);
        Mahasiswa mahasiswa3 = new Mahasiswa("Yanto", 19104011);

        // List Mahasiswa dari Class Demo
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("Yanti\t", 19104066));

        // Untuk copas data dari list mahasiswa class "demoJurusan" ke class "Jurusan"
        jurusan.setMahasiswaList(mahasiswaList);

        // Untuk masukan data Mahasiswa langsung ke class Jurusan
        jurusan.addMahasiswa(mahasiswa3);

        jurusan.printDataJurusan();

    }
}
