import java.util.Scanner;

public class CodeChefStarter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 2,b = 3;


        for (int i = 0; i < t; i++) {

            int mean = sc.nextInt();
            int sum=mean*3;
            int c = sum-(a+b);
            System.out.println(a + " " + b + " " + c);
        }
    }
}
