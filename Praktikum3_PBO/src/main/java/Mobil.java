/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mai
 */
public class Mobil {
    // Atribut
    private String merk;
    private String model;
    private int tahun;
    private String warna; // Atribut baru

    // Constructor diupdate
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter & Setter untuk merk, model, tahun (sama seperti sebelumnya)
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }

    // Getter & Setter untuk atribut baru 'warna'
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        // Tambahan info saat warna diubah
        System.out.println("INFO: Warna mobil " + this.merk + " berubah dari " + this.warna + " menjadi " + warna + ".");
        this.warna = warna;
    }

    // Method displayInfo diupdate
    public void displayInfo() {
        System.out.println("\n--- Informasi Mobil ---");
        System.out.println("Merk  : " + this.merk);
        System.out.println("Model : " + this.model);
        System.out.println("Tahun : " + this.tahun);
        System.out.println("Warna : " + this.warna); // Tampilkan warna
        System.out.println("-----------------------");
    }

    // Method startEngine
    public void startEngine() {
        System.out.println("Mesin mobil " + this.merk + " menyala.");
    }
}