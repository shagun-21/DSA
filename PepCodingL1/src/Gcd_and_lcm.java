import java.util.Scanner;

public class Gcd_and_lcm {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n1=sc.nextInt();
            int n2=sc.nextInt();

            int on1=n1;
            int on2=n2;


            while(n2%n1 !=0){
                int remainder=n2%n1;
                n2=n1;
                n1=remainder;
            }
             int gcd=n1;
            int lcm=(on1*on2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);




    }
}
