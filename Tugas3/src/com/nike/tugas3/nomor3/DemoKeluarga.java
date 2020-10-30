package com.nike.tugas3.nomor3;

import java.util.ArrayList;

public class DemoKeluarga {
    public static void main(String[] args) {
        // Insiasi objek keluarga
        Keluarga keluarga = new Keluarga("Keluarga Toba", "Padang");

        // Deklarasi ArrayList Anak
        ArrayList<Anak> anakList = new ArrayList<>();

        // Memanggil method addAnggotaKeluarga dan menginisiasi data ayah, ibu, dan anak
        keluarga.addAnggotaKeluarga(new Ayah(1, "Toba", 45),
                new Ibu(2, "Kartini", 50),
                anakList);
        // Menambahkan objek anak kedalam anakList
        anakList.add(new Anak(3, "Samosir", 18,"Anak Durhaka"));
        anakList.add(new Anak(4, "Sampokong", 12,"Anak Pungut"));

        // Memanggil method getDataKeluarga output program
        keluarga.getDataKeluarga();
    }
}
