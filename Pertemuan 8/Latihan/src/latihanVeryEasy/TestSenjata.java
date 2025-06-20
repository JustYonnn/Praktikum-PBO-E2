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
 * Nama File : TestSenjata.java
 * Deskripsi : Main program dari class Senjata
 * Pembuat : Umar Faqih / 24060123120003
 * Tanggal : 1 Mei 2025
 */

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        ak47.getPeluru();
        ak47.setPeluru(5);
        System.out.println("AK47 mengisi peluru ");
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}
