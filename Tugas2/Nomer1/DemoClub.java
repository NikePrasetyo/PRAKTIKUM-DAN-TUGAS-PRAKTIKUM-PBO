package com.nike.Tugas2.Nomer1;

public class DemoClub {
    public static void main(String[] args) {

        // Inisiasi Objek
        Club club1 = new Club();
        Club club2 = new Club("FC Barcelona");
        Club club3 = new Club("FC Barcelona", "FC Barcelona adalah sebuah klub sepak bola Liga Spanyol");
        Club club4 = new Club("FC Barcelona", 1899, "Camp Nou");
        Club club5 = new Club("FC Barcelona", 1899, "Camp Nou", 5, "FC Barcelona adalah sebuah klub sepak bola Liga Spanyol");

        // Memanggil Method getTeam dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}