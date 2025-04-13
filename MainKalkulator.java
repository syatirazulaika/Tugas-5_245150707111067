package PraktikumLima;

import java.util.Scanner;

public class MainKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator op = new Kalkulator();

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Hasil Penjumlahan: " + Kalkulator.tambah(a, b));
        System.out.println("Hasil Pengurangan: " + Kalkulator.kurang(a, b));
        System.out.println("Hasil Perkalian: " + op.kali(a, b));
        System.out.println("Hasil Pembagian: " + op.bagi(a, b));

        System.out.print("\nMasukkan pembilang pecahan: ");
        int pembilang = input.nextInt();
        System.out.print("Masukkan penyebut pecahan: ");
        int penyebut = input.nextInt();
        op.sederhana(pembilang, penyebut);
    }
}
