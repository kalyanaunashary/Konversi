/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

import java.util.Scanner;
import static konversi.KonversiDetik.detikKeHari;
import static konversi.KonversiJamKeMenit.jamKeMenit;

/**
 *
 * @author Windows 8
 */
public class Konversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Pilihan Konversi:\n"
        + " 1. Jam -> Menit\n"
        + " 2. Detik -> Hari, jam, menit, dan detik");

    System.out.println("\nMasukkan pilihan");
        try (Scanner options = new Scanner(System.in)) {
        if (!options.hasNextInt()) {

    System.out.println("Itu alfabet, anda salah!");
    } else {
    if (options.nextInt() == 1) {

    System.out.println("Masukkan jam :");
    Scanner hours = new Scanner(System.in);
    jamKeMenit(hours.nextInt());
    } else {

    System.out.println("Masukkan detik :");
    try (Scanner seconds = new Scanner(System.in)) {
    detikKeHari(seconds.nextLong()); }
}
}
        }
    }
}