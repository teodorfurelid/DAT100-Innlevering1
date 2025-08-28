import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Kva er dinn lønn? ");

        int lonn = in.nextInt();
        int skatt0 = 0;
        double skatt1 = 0.017;
        double skatt2 = 0.04;
        double skatt3 = 0.137;
        double skatt4 = 0.167;
        double skatt5 = 0.177;

        if (lonn <= 217400) {
            System.out.print("Dinn trinnskatt er: " + skatt0);
        } else if (lonn > 217400 && lonn < 306050) {
            System.out.print("Dinn trinnskatt er: " + (skatt1*lonn) + "kr");
        } else if (lonn > 306050 && lonn < 697150) {
            System.out.print("Dinn trinnskatt er: " + (skatt2*lonn) + "kr");
        } else if (lonn > 697150 && lonn < 942400) {
            System.out.print("Dinn trinnskatt er: " + (skatt3*lonn) + "kr");
        } else if (lonn > 942400 && lonn < 1410750) {
            System.out.print("Din trinnskatt er: "  + (skatt4*lonn) + "kr");
        } else if (lonn > 1410750) {
            System.out.print("Din trinnskatt er: " + (skatt5*lonn) + "kr");
        }


        in.close();
    }
}

