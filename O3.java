import java.util.Scanner;
import static java.lang.Math.*;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Skriv eit tall Z+(Posetive naturlige tall): ");

        long n = in.nextInt();
        long faktuelt = (1*2*3*(n-1)*n);


        System.out.println("Faktuelt tall: " + faktuelt);



        in.close();
    }
}
