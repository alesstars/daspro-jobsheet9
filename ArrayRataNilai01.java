import java.util.Scanner;

public class ArrayRataNilai01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nilaiMhs[] = new int[10], total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0], terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        String status = "";

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (rata2 >= 85) {
                status = "SANGAT BAIK";
            } else if (rata2 >= 70) {
                status = "BAIK";
            } else {
                status = "PERLU PENDAMPINGAN";
            }
        }

        System.out.println("Predikat kelas: " + status);

        sc.close();
    }
}
