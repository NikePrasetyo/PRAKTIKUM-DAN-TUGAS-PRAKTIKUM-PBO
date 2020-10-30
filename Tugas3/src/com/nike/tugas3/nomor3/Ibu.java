package com.nike.tugas3.nomor3;

public class Ibu {
    // Deklarasi variabel
    private int idIbu; //  integer
    private String namaIbu; //  string
    private int umurIbu; //  integer

    //  parameter idIbu, namaIbu, dan umurIbu
    public Ibu(int idIbu, String namaIbu, int umurIbu) {
        this.idIbu = idIbu;
        this.namaIbu = namaIbu;
        this.umurIbu = umurIbu;
    }

    // Method getter
    public int getIdIbu() {
        return idIbu;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public int getUmurIbu() {
        return umurIbu;
    }
}
