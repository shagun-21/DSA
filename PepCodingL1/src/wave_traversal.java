import java.util.Scanner;

public class wave_traversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a= new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int j=0;j<a[0].length;j++){
            if (j%2==0){
                for (int i=0;i<a.length;i++){
                    System.out.println(a[i][j]);
                }
            }
            else{
                for (int i=a.length-1;i>=0;i--){
                    System.out.println(a[i][j]);
                }
            }
            System.out.println();
        }
    }
}
