/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mai
 */
public class Main {
    public static void main(String[] args) {
        // Pembuatan objek diupdate dengan atribut warna
        Mobil mobil1 = new Mobil("Bentley", "Flying spur", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Bentley", "Continental", 2025, "Putih");

        // Menampilkan informasi awal
        System.out.println(">>> Menampilkan informasi awal object:");
        mobil1.displayInfo();
        mobil2.displayInfo();

        // Menyalakan mesin
        System.out.println("\n>>> Menyalakan mesin:");
        mobil1.startEngine();
        mobil2.startEngine();

        // Mengubah warna mobil pertama menggunakan setter
        System.out.println("\n>>> Memodifikasi warna mobil pertama:");
        mobil1.setWarna("Hitam");

        // Menampilkan informasi mobil pertama setelah warnanya diubah
        mobil1.displayInfo();
    }
}