import java.util.Scanner;

public class ArrayRataNilai08Modif2 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input08.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input08.nextInt();
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jumlahTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }
        

        double rataLulus = totalLulus / jumlahLulus;
        double rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
        System.out.println("Rata-rata lulus = " + rataLulus);
        System.out.println("Rata-rata tidak lulus = " + rataTidakLulus);
    }
}
