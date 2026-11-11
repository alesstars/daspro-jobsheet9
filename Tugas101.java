import java.util.Scanner;

public class Tugas101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nilaiMhs[] = new int[5], total = 0;
        double rataRata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        
        rataRata = (double) total / nilaiMhs.length;

        System.out.println("Rata-rata nilai: " + rataRata);

        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] >= 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " => " + status);
        }

        sc.close();
    }
}
