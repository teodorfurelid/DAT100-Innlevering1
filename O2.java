import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        for(int i = 1; i <= 10 ; i++) {
            int karakter;

            while (true) {
                System.out.print("Karaktervurdering (" +  i + ") 0-100: " );
                karakter = in.nextInt();

                if (karakter < 0) {
                    System.out.println("Ugyldig poengsum!! kan ikkje vere(negativ) -> Prøv igjen");
                } else if (karakter > 100) {
                    System.out.println("Ugyldig poengsum!!! kan ikkje vere >(100) -> Prøv igjen");
                } else {
                    break;
                }
            }

            if (karakter > 89) {
                System.out.println("Karakter: A");
            } else if (karakter > 79) {
                System.out.println("Karakter: B");
            } else if (karakter > 59) {
                System.out.println("Karakter: C");
            } else if (karakter > 49) {
                System.out.println("Karakter: D");
            } else if (karakter > 39) {
                System.out.println("Karakter: E");
            } else {
                System.out.println("Karakter: F");
            }
        }
        in.close();

        System.out.print("Laga av Teooo-Furris");
    }
}
