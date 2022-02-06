import java.util.Scanner;

public class CodeChefStarter3 {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for (int i=0;i<t;i++){
          int n=sc.nextInt();
          int x=sc.nextInt();
          int y=sc.nextInt();

          if (x<y){
              System.out.println("-1");
              continue;
          }
          int c=0;
          for (int j=0;j<n;j++){
              System.out.println(c%y);
              c++;
          }

          }
        }

    }




