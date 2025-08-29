import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Les inn talet n
        System.out.print("Skriv inn eit heiltal n (> 0): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Feil: n må vere større enn 0.");
        } else {
            long fakultet = 1; // brukar long for å tåle større tal
            for (int i = 1; i <= n; i++) {
                fakultet *= i;
            }
            System.out.println(n + "! = " + fakultet);
        }

        input.close();
    }
}
