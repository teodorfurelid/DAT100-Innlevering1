import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Skriv eit tall n (n>0): ");

        int n = sc.nextInt();
        int k = 2;

        for (int j = 0; j < k; j++) {
            if (n <= 0) {
                System.out.println("Ugyldig tall");
            } else {
                long fakultet = 1;
                for (int i = 1; i <= n; i++) {
                    fakultet *= i;
                }
                System.out.println(n + "! er: " + fakultet);
            }
            System.out.print("Skriv eit tall n (n>0): ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
