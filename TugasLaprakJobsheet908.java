import java.util.Scanner;

public class TugasLaprakJobsheet908 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen dalam array: ");
        int jumlahElemen = input.nextInt();

        int[] arrayInt = new int[jumlahElemen];

        System.out.println("Masukkan nilai untuk setiap elemen array:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            arrayInt[i] = input.nextInt();
        }

        int nilaiTertinggi = arrayInt[0];
        int nilaiTerendah = arrayInt[0];
        int total = 0;

        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayInt[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayInt[i];
            }
            if (arrayInt[i] < nilaiTerendah) {
                nilaiTerendah = arrayInt[i];
            }
            total += arrayInt[i];
        }

        double rataRata = (double) total / jumlahElemen;

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
