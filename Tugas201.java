import java.util.Scanner;

public class Tugas201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu[] = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int harga[] = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        
        System.out.print("Masukkan jumlah menu yang ingin dipesan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine(); 

        String menuDipesan[] = new String[jmlPesanan];
        int totalHarga = 0;

        System.out.println("========================================");

        for (int i = 0; i < jmlPesanan; i++) {
            boolean found;

            do {
                found = false;
                
                System.out.print("Masukkan nama menu ke-" + (i + 1) + " yang ingin dipesan: ");
                String pilihan = sc.nextLine();
                
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(pilihan)) {
                        found = true;
                        menuDipesan[i] = menu[j];
                        totalHarga += harga[j];
                        System.out.println("Harga: Rp. " + harga[j]);
                        break;
                    }
                }
                
                if (!found) {
                    System.out.println("Mohon maaf, menu tersebut tidak tersedia di kafe. Silakan masukkan ulang.");
                }
                
            } while (!found);
            
            System.out.println("----------------------------------------");
        }

        System.out.println("\n========= STRUK PEMESANAN KAFE =========");
        System.out.println("Menu yang dipesan:");
        for (int i = 0; i < menuDipesan.length; i++) {
            System.out.println("- " + menuDipesan[i]);
        }
        System.out.println("========================================");
        System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
        System.out.println("========================================");

        sc.close();
    }
}