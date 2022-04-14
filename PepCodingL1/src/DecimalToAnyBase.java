import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int base=sc.nextInt();
        int rv=0;
        int power=1;
        while(n >0){
            int digit = n%base;
            n=n/base;
            rv += digit*power;
            power=power*10;
        }
        System.out.println(rv);
    }
}
