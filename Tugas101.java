import java.util.Scanner;

public class Tugas101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jmlMhs, total = 0;
        double rataRata;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();
        int nilaiMhs[] = new int[jmlMhs];

        System.out.println("================================");

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        int tertinggi = nilaiMhs[0], terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        
        rataRata = (double) total / nilaiMhs.length;

        System.out.println("================================");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("================================");

        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] >= 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " => " + status);
        }

        sc.close();
    }
}
