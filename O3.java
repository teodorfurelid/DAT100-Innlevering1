import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < 2; j++) {

            System.out.print("Skriv eit tall n (n>0): ");
            int n = sc.nextInt();


            while (true){
                if (n <= 0) {
                    System.out.println("Ugyldig tall");
                } else {
                    break;
                }
            }
                if (n > 0){
                long fakultet = 1;
                for (int i = 1; i <= n; i++) {
                    fakultet *= i;
                }
                System.out.println(n + "! er: " + fakultet);
            }
        }
        sc.close();
    }
}
