import java.util.Scanner;

public class AnyBasetoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("give the base");
        int b=sc.nextInt();
        int p=1;
        int rv=0;

        while(n>0){
            int digit=n%10;
            n=n/10;
            rv+=digit*p;
            p=p*b;
        }
        System.out.println(rv);
    }
}
