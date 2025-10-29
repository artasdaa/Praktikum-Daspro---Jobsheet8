import java.util.Scanner;

public class JumlahKuadratInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int nMax = sc.nextInt();
        int jumlah;

        for (int n = 1; n <= nMax; n++) {
            jumlah = 0;
            System.out.print("n = " + n + " → jumlah kuadrat = ");

            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                jumlah += kuadrat;

                System.out.print(kuadrat);
                if (i < n) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }

        sc.close();
    }
}
