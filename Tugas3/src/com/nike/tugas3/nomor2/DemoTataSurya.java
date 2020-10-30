package com.nike.tugas3.nomor2;

import java.util.ArrayList;
import java.util.List;

public class DemoTataSurya {
    public static void main(String[] args) {
        List<Planet> planet = new ArrayList<>();
        Planet planet1 = new Planet(111,1,"Merkurius");
        Planet planet2 = new Planet(112,2,"Venus");
        Planet planet3 = new Planet(113,3,"Bumi");
        Planet planet4 = new Planet(114,4,"Mars");
        Planet planet5 = new Planet(115,5,"Jupiter");
        Planet planet6 = new Planet(116,6,"Saturnus");
        Planet planet7 = new Planet(117,7,"Uranus");
        Planet planet8 = new Planet(118,8,"Neptunus");

        SolarSystem solSys = new SolarSystem("12345678", "Tata Surya");

        planet.add(planet1);
        planet.add(planet2);
        planet.add(planet3);
        planet.add(planet4);
        planet.add(planet5);
        planet.add(planet6);
        planet.add(planet7);
        planet.add(planet8);

        solSys.setPlanets(planet);
        solSys.getData();

    }
}
