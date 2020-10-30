package com.nike.tugas3.nomor1;

public class DemoPerumahan {
    public static void main(String[] args) {
        Rumah rumah1 = new Rumah("01", "Ani", 4);
        Rumah rumah2 = new Rumah("02", "Ayu", 3);
        Rumah rumah3 = new Rumah("03", "Hana", 4);
        Rumah rumah4 = new Rumah("04", "Feny", 2);

        Komplek komplek1 = new Komplek("101", "Halmahera");

        komplek1.addRumah(rumah1.getIdRumah());
        komplek1.addRumah(rumah2.getIdRumah());
        komplek1.addRumah(rumah3.getIdRumah());
        komplek1.addRumah(rumah4.getIdRumah());

        komplek1.getDataKomplek();
    }
}
