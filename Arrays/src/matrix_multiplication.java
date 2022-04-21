import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][] a= new int[r1][c1];
        int [][] b= new int[r2][c2];

        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }

        }
        int [][]prd=new int[r1][c2];

        if (c1 != r2){
            System.out.println("Invalid input");
        }

        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                for (int k=0;k<c1;k++){
                    prd[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                System.out.print(prd[i][j]+" ");
            }
            System.out.println();
        }

    }
}
