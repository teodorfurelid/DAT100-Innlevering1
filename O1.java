import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Kva er din lønn: ");
        int lonn = in.nextInt();

        int t1 = 217400;
        int t2 = 306051;
        int t3 = 697151;
        int t4 = 942401;
        int t5 = 1410751;

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
            System.out.print("Dinn skatt: " + (int)(((lonn-t2)*s2)+(t2*s1)));
            //Tar lønn - 306 k og overskuddet blir skatta; deretter plusser vi på skatt fra forrige trinn.
        }else if (lonn < t4) {
            System.out.println("Trinn 3");
            System.out.print("Dinn skatt: " + (int)(((lonn-t3)*s3)+(t2*s1)+(t3*s2)));
            //Tar lønn - 697 k og overskuddet blir skatta; deretter plusser vi på skatt fra dei to forrige trinna
        } else if (lonn < t5) {
            System.out.println("Trinn 4");
            System.out.print("Dinn skatt: " + (int)(((lonn-t4)*s4)+(t2*s1)+(t3*s2)+(t4*s3)));
            //Tar lønn - 947 k og overskuddet blir skatta; deretter plusser vi på skatt fra dei tre forrige trinna
        } else {
            System.out.println("Trinn 5");
            System.out.print("Dinn skatt: " + (int)(((lonn-t5)*s5)+(t2*s1)+(t3*s2)+(t4*s3)+(t5*s4)));
        }




        in.close();
    }
}


