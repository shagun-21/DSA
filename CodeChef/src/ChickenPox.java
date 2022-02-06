import java.util.Scanner;

public class ChickenPox {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int u=x-y;

            if (x!=y){
                System.out.println((y)*2+u);
            }
            else{
                System.out.println((y*2-1));
            }

        }
    }
}
