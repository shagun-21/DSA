import java.util.Scanner;

public class CodeChefStarter1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){

            int x = sc.nextInt();
            int y= sc.nextInt();
            int z= sc.nextInt();
            int profit= (x*y)-(x*z);
            System.out.println(profit);

        }
    }
}
