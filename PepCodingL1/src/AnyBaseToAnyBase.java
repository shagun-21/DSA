import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int rv1=anyBaseToDecimal(n,b1);
        int rv2=decimalToAnyBase(rv1,b2);
        System.out.println(rv2);
    }

    private static int decimalToAnyBase(int rv1, int b2) {
        int r2=0;
        int power=1;
        while(rv1>0){
            int digit=rv1%b2;
            rv1=rv1/b2;
            r2+=digit*power;
            power=power*10;
        }

        return r2;
    }

    private static int anyBaseToDecimal(int n,int base) {
        int r1=0;
        int power=1;
            while(n>0){
                int digit=n%10;
                n=n/10;
                r1+=digit*power;
                power=power*base;

            }
        return r1;
    }
}
