/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author asus
 */

/**
 * Nama File : Senjata.java
 * Deskripsi : Berisi atribut dan method class Senjata
 * Pembuat : Umar Faqih / 24060123120003
 * Tanggal : 1 Mei 2025
 */

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak() {
        if (this.getPeluru() > 0) {
            System.out.println(this.getBunyi());
            this.setPeluru(this.getPeluru() - 1);
            System.out.println("Sisa peluru: " + this.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
    }
}
