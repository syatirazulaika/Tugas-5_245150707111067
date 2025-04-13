package PraktikumLima;

public class Kalkulator {

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Tidak diperbolehkan pembagian dengan 0!.");
            return 0;
        }
        return (double) a / b;
    }

    public void sederhana(int pembilang, int penyebut) {
        int gcd = cariFPB(pembilang, penyebut);
        pembilang /= gcd;
        penyebut /= gcd;
        System.out.println("Pecahan yang disederhanakan: " + pembilang + "/" + penyebut);
    }

    private int cariFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
