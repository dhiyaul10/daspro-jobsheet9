import java.util.Scanner;

public class ArrayNilai08Modif2 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = input08.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Mahasiswa ke-"+i+" lulus!");
        }
    }
}