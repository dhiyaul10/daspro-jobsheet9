import java.util.Scanner;

public class LinearSearch08Modif1 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = input08.nextInt();

        int[] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 0) + " : ");
            arrayInt[i] = input08.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input08.nextInt();

        int hasil = -1; 

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("key ada di posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}
