package com.nike.modul3.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Andi");
        mahasiswa1.setNim(19104088);

        Mahasiswa mahasiswa2 = new Mahasiswa(19104023, "Joni");

        Dosen dosen = new Dosen();
        dosen.setKodeDosen("WOW");
        dosen.setNimMhs(mahasiswa1.getNim());
        dosen.setNimMhs(mahasiswa2.getNim());

        System.out.println("Kode dosen\t: " + dosen.getKodeDosen());
        System.out.println("Mengajar Mahasiswa\t: ");

        for (int i = 0; i < dosen.getJmlMahasiswa(); i++) {
            System.out.println("- " + dosen.getNimMhs(i));
        }

    }
}
