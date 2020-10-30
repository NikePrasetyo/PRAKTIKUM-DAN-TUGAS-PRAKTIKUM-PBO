package com.nike.tugas4;

public abstract class Employee {
    //akses dasar terhadap metode
    protected String nama;
    protected String nip;
    protected Float upah;
    protected Float komisi;
    protected Float total_penjualan;
    protected Float total_proyek;

    // contructor
    Employee(
            String nama,
            String nip,
            float upah,
            float komisi,
            float total_penjualan,
            float total_proyek
    ) {
        //value dari param
        this.nama = nama;
        this.nip = nip;
        this.upah = upah;
        this.komisi = komisi;
        this.total_penjualan = total_penjualan;
        this.total_proyek = total_proyek;
    }

    public abstract void getGaji();
    //Akhir dari abstrat
}
