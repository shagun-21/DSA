package recursion;

import java.util.Scanner;

public class linearPower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int power=sc.nextInt();
       int ans=linearPower(n,power);
        System.out.println(ans);

    }
    static int linearPower(int n,int power){
        if (power==0){
            return 1;
        }
        return n*linearPower(n,power-1);
    }
}
