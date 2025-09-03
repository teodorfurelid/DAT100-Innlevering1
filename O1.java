import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Kva er din lønn: ");
        int lonn = in.nextInt();

        int t1 = 217400;
        int t2 = 306050;
        int t3 = 697150;
        int t4 = 942400;
        int t5 = 1410750;

        double s_1 = 0.00;
        double s1 = 0.017;
        double s2 = 0.04;
        double s3 = 0.137;
        double s4 = 0.167;
        double s5 = 0.177;

        if (lonn < t1) {
            System.out.println("Dinn skatt: " + (int)(lonn*s_1));
        } else if (lonn < t2) {
            System.out.println("Trinn 1");
            System.out.print("Dinn skatt: " + (int)(lonn*s1));
        } else if (lonn < t3) {
            System.out.println("Trinn 2");
            System.out.print("Dinn skatt: " + (int)(((t3-lonn)*s2)+(t1*s1)));
        }else if (lonn < t4) {
            System.out.println("Trinn 3");
            System.out.print("Dinn skatt: " + (int)(((t4-lonn)*s3)+(t1*s1)+(t2*s2)));
        } else if (lonn < t5) {
            System.out.println("Trinn 4");
            System.out.print("Dinn skatt: " + (int)(((t5-lonn)*s4)+(t1*s1)+(t2*s2)+(t3*s3)));
        } else {
            System.out.println("Trinn 5");
            System.out.print("Dinn skatt: " + (int)((lonn-t5)*(s5)+(t1*s1)+(t2*s2)+(t3*s3)+(t4*s4)));
        }




        in.close();
    }
}


