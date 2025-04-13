package PraktikumLima;

public class Jaket {
    private final int HARGA_A = 100000;
    private final int HARGA_B = 125000;
    private final int HARGA_C = 175000;

    public int getHargaA(int jumlah) {
        return (jumlah > 100) ? 95000 : HARGA_A;
    }

    public int getHargaB(int jumlah) {
        return (jumlah > 100) ? 120000 : HARGA_B;
    }

    public int getHargaC(int jumlah) {
        return (jumlah > 100) ? 160000 : HARGA_C;
    }

    public int hitungTotalA(int jumlah) {
        return getHargaA(jumlah) * jumlah;
    }

    public int hitungTotalB(int jumlah) {
        return getHargaB(jumlah) * jumlah;
    }

    public int hitungTotalC(int jumlah) {
        return getHargaC(jumlah) * jumlah;
    }

    public int hitungTotalSemua(int jumlahA, int jumlahB, int jumlahC) {
        return hitungTotalA(jumlahA) + hitungTotalB(jumlahB) + hitungTotalC(jumlahC);
    }

    public int getHargaNormalA() {
        return HARGA_A;
    }

    public int getHargaNormalB() {
        return HARGA_B;
    }

    public int getHargaNormalC() {
        return HARGA_C;
    }
}
