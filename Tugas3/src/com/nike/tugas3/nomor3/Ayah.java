package com.nike.tugas3.nomor3;

public class Ayah {
    // Deklarasi variabel
    private int idAyah; // integer
    private String namaAyah; // string
    private int umurAyah; // integer

    // Constractor
    public Ayah(int idAyah, String namaAyah, int umurAyah) {
        this.idAyah = idAyah;
        this.namaAyah = namaAyah;
        this.umurAyah = umurAyah;
    }

    // Method getter
    public int getIdAyah() {
        return idAyah;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public int getUmurAyah() {
        return umurAyah;
    }
}
