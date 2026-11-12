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
            System.out.print("Masukkan nama menu ke-" + (i + 1) + " yang ingin dipesan: ");
            String pilihan = sc.nextLine();
            
            boolean ditemukan = false;

            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(pilihan)) {
                    ditemukan = true;
                    menuDipesan[i] = menu[j];
                    totalHarga += harga[j];
                    System.out.println("-> Menu ditemukan! Harga: Rp. " + harga[j]);
                    break;
                }
            }
            
            if (!ditemukan) {
                System.out.println("-> Mohon maaf, menu tersebut tidak tersedia di kafe.");
                menuDipesan[i] = pilihan + " (Tidak Tersedia)";
            }
            System.out.println("----------------------------------------");
        }

        System.out.println("\n========= STRUK PEMESANAN KAFE =========");
        System.out.println("Daftar menu yang dipesan:");
        for (int i = 0; i < menuDipesan.length; i++) {
            System.out.println("- " + menuDipesan[i]);
        }
        System.out.println("========================================");
        System.out.println("Total keseluruhan biaya: Rp. " + totalHarga);
        System.out.println("========================================");

        sc.close();
    }
}