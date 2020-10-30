package com.nike.tugas3.nomor3;

public class Anak {
    // Deklarasi Variabel
    private int idAnak; // integer
    private String namaAnak; // string
    private int umurAnak; // interger
    private String statusAnak; // string

    // Constractor
    public Anak(int idAnak, String namaAnak, int umurAnak, String statusAnak) {
        this.idAnak = idAnak;
        this.namaAnak = namaAnak;
        this.umurAnak = umurAnak;
        this.statusAnak = statusAnak;
    }

    // Method getter
    public int getIdAnak() {
        return idAnak;
    }

    public String getNamaAnak() {
        return namaAnak;
    }

    public int getUmurAnak() {
        return umurAnak;
    }

    public String getStatusAnak() {
        return statusAnak;
    }
}
