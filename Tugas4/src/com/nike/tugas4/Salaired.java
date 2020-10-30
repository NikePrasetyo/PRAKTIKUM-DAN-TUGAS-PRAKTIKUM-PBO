package com.nike.tugas4;

public class Salaired extends Employee {

    //Method
    public Salaired(
            String nama,
            String nip,
            float upah,
            float komisi,
            float total_penjualan,
            float total_proyek
    ) {
        //Constructor
        super(
                nama,
                nip,
                upah,
                (float) 0,
                (float) 0,
                (float) 0
        );
    }
    //Override Methods
    @Override
    public void getGaji() {
        System.out.println("Total gaji " + this.nama + " adalah " + this.upah);
    }

}
