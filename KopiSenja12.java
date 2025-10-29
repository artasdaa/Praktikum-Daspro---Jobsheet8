import java.util.Scanner;

public class KopiSenja12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        int totalPelanggan = 0;
        int totalItemTerjual = 0;

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n=== Cabang " + i + " ===");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            int totalItemCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            totalPelanggan += jumlahPelanggan;
            totalItemTerjual += totalItemCabang;

            System.out.println("\n-- Hasil Cabang " + i + " --");
            System.out.println("Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("Item terjual: " + totalItemCabang + " item");
        }

        System.out.println("\n=== Total Seluruh Cabang ===");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItemTerjual + " item");

        sc.close();
    }
}
