import java.util.Scanner;

public class JumlahKuadrat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int total = 0;
            for (int j = 1; j <= i; j++) {
                total += j * j;
            }
            System.out.println("n = " + i + " jumlah kuadrat = " + total);
        }

        sc.close();
    }
}
