import java.util.Scanner;

public class SearchNilai01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nilai[] = {78, 65, 90, 55, 88, 72};
        int key;
        boolean found; 

        do {
            found = false; 

            System.out.print("Masukkan nilai yang dicari: ");
            key = sc.nextInt();

            for (int i = 0; i < nilai.length; i++) {
                if (nilai[i] == key) {
                    System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Nilai " + key + " tidak ditemukan dalam array. Silakan coba lagi!\n");
            }

        } while (!found);

        sc.close();
    } 
}