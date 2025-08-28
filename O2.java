import java.math.MathContext;
import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        System.out.print("Karaktervurdering 0-100: ");

        Scanner in  = new Scanner(System.in);

        for(int i = 1; i <= 10 ; i++) {
            int karakter = in.nextInt();
            System.out.print("Karaktervurdering "+(i)+" ");

            if (karakter < 0) {
                System.out.println("Ugyldig poengsum (kan ikkje vere negativ).");
            } else if (karakter > 100) {
                System.out.println("Ugyldig poengsum (kan ikkje vere over 100).");
            } else if (karakter > 89) {
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
            System.out.print("Karaktervurdering" + "(" + (i+1) + ")" + " 0-100: ");
        }
        in.close();
    }
}
