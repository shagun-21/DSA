import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nod=0;
        int temp= n;
        while(temp!=0){
            temp=temp/10;
            nod++;
        }
        int divisor=(int)Math.pow(10,nod-1);
        while(divisor!=0){
            int q=n/divisor;
            System.out.println(q);
            n=n%divisor;
            divisor=divisor/10;
        }
    }
}
