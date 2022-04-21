package recursion;

import java.util.Scanner;

public class linearPowerLogarthmic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int ans=Lpower(n,x);
        System.out.println(ans);

    }
    static int Lpower(int n,int x){
       if (x==0){
           return 1;
       }
       int pb2=Lpower(n,x/2);
       int xn=pb2*pb2;
       if (x%2==1){
           xn=xn*n;
       }
       return xn;
    }
}
