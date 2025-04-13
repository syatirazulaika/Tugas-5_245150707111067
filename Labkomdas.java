package PraktikumLima;

import java.util.Scanner;

public class Labkomdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jaket jaket = new Jaket();

        System.out.println("=== CV. Labkomdas - Program Pembelian Jaket ===");
        System.out.println("Harga Normal:");
        System.out.println(" - Jaket A: Rp" + jaket.getHargaNormalA());
        System.out.println(" - Jaket B: Rp" + jaket.getHargaNormalB());
        System.out.println(" - Jaket C: Rp" + jaket.getHargaNormalC());
        System.out.println("Note: Diskon jika beli lebih dari 100 pcs.\n");

        System.out.print("Masukkan jumlah jaket A yang dibeli: ");
        int jumlahA = input.nextInt();
        System.out.print("Masukkan jumlah jaket B yang dibeli: ");
        int jumlahB = input.nextInt();
        System.out.print("Masukkan jumlah jaket C yang dibeli: ");
        int jumlahC = input.nextInt();

        int hargaA = jaket.getHargaA(jumlahA);
        int hargaB = jaket.getHargaB(jumlahB);
        int hargaC = jaket.getHargaC(jumlahC);

        int totalA = jaket.hitungTotalA(jumlahA);
        int totalB = jaket.hitungTotalB(jumlahB);
        int totalC = jaket.hitungTotalC(jumlahC);
        int totalSemua = jaket.hitungTotalSemua(jumlahA, jumlahB, jumlahC);

        System.out.println("\n========= RINCIAN PEMBELIAN =========");

        System.out.println("Jaket A:");
        System.out.println("  Jumlah dibeli         : " + jumlahA);
        System.out.println("  Harga normal per jaket: Rp" + jaket.getHargaNormalA());
        System.out.println("  Harga yang dipakai    : Rp" + hargaA);
        System.out.println("  " + ((jumlahA > 100) ? "*Dapat diskon!" : "Tidak dapat diskon."));
        System.out.println("  Total harga           : Rp" + totalA);

        System.out.println("\nJaket B:");
        System.out.println("  Jumlah dibeli         : " + jumlahB);
        System.out.println("  Harga normal per jaket: Rp" + jaket.getHargaNormalB());
        System.out.println("  Harga yang dipakai    : Rp" + hargaB);
        System.out.println("  " + ((jumlahB > 100) ? "*Dapat diskon!" : "Tidak dapat diskon."));
        System.out.println("  Total harga           : Rp" + totalB);

        System.out.println("\nJaket C:");
        System.out.println("  Jumlah dibeli         : " + jumlahC);
        System.out.println("  Harga normal per jaket: Rp" + jaket.getHargaNormalC());
        System.out.println("  Harga yang dipakai    : Rp" + hargaC);
        System.out.println("  " + ((jumlahC > 100) ? "*Dapat diskon!" : "Tidak dapat diskon."));
        System.out.println("  Total harga           : Rp" + totalC);

        System.out.println("\n======================================");
        System.out.println("Total seluruh pembelian : Rp" + totalSemua);
        System.out.println("======================================");
    }
}
