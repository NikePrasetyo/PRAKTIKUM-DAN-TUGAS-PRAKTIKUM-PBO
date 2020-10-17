package com.nike.Latihan.Modul1;

public class BiodataKaryawan {
    private static String nama = "joni tarso";
    private static String ttl = "purwokerto, 17 agustus 2001";
    private static String alamat = "Jln. Buntu";
    private static String kelamin = "Laki-Laki";
    private static String status = "Belum Kawin";
    private static String riwayat= "S1 Software Engineering";
    private static String email = "jons@gmail.com";
    private static String nomer = "087899904743";

    public static void main(String[] args) {

        // Output Biodata Karyawan PT Tadika Mesra
        System.out.println("*** Biodata Karyawan PT NASA ***");
        System.out.println("Nama Lengkap\t\t : " + nama);
        System.out.println("TTL\t\t\t\t\t : " + ttl);
        System.out.println("Alamat\t\t\t\t : " + alamat);
        System.out.println("Jenis Kelamin\t\t : " + kelamin);
        System.out.println("Status Pernikahan\t : " + status);
        System.out.println("Pendidikan Terakhir\t : " + riwayat);
        System.out.println("Email\t\t\t\t : " + email);
        System.out.println("Nomer HP\t\t\t : " + nomer);
    }
}