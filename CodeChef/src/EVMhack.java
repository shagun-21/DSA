import java.util.Scanner;

public class EVMhack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            int r=sc.nextInt();

            if ((p+b+c)>(p+q+r)/2){
                System.out.println("YES");
            }
            else if((a+q+c)>(p+q+r)/2){
                System.out.println("YES");
            }
            else if((a+b+r)>(p+q+r)/2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }

    }
}
