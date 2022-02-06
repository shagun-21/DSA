import java.util.Scanner;

public class FindElementOfFibonacci {
    public static void main(String[] args) {
        int[]arr={0,1,1,2,3,5,8,13};
        Scanner sc= new Scanner(System.in);
        int toFind=sc.nextInt();



        System.out.println("The " +toFind+" element is: "+FindFiboElement(arr,toFind));
    }
    static int FindFiboElement(int[] a,int num){
        a[0]=0;
        a[1]=1;
        for(int i=2;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
        System.out.println();
            return a[num-1];
    }

    }

