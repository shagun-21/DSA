import java.util.Scanner;

public class digits_frequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        int digit=7;
        while(n!=0){
            int remainder=n%10;
            if (remainder==digit){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}
