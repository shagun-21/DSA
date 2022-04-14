import java.util.Scanner;

public class pythagorean_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c =sc.nextInt();
        if ((a*a==b*b+c*c)||(b*b==c*c+a*a)||(c*c==b*b+a*a)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
