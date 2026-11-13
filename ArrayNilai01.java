import java.util.Scanner;

public class ArrayNilai01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nilaiAkhir[] = new int[10];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        int nomor = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";

            if (nilai > 70) {
                System.out.println("Mahasiswa ke-" + nomor + " : " + nilai + " (" + status + ")");
            }
            nomor++;
        }

        sc.close();
    }
}