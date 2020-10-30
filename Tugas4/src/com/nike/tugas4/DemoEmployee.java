package com.nike.tugas4;

import java.util.Random;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee[] employee = {
                //Pemanggil Class dalam Method Array
                new Commision(
                        "Sukim",
                        "19104040",
                        100000,
                        15000,
                        3,
                        (float) 0
                ),
                //Pemanggil Class dalam Method Array
                new Salaired(
                        "Taryono",
                        "19104067",
                        120000,
                        20000,
                        1,
                        5
                ),
                //Pemanggil Class dalam Method Array
                new ProjectPlanner(
                        "Tarso",
                        "19104069",
                        300000,
                        40000,
                        10,
                        10
                )
        };

        //random index
        Random pilihan = new Random();
        Employee karyawan = employee[pilihan.nextInt(employee.length)];

        // Get gaji
        System.out.println("Semua gaji karyawan");
        karyawan.getGaji();
    }
}
