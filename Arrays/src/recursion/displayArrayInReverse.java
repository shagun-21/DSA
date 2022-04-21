package recursion;

import java.util.Scanner;

public class displayArrayInReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int li=n-1;
        displayArrayInReverse(a,li);

    }
    static void displayArrayInReverse(int[] arr,int n ){
        if (n<0){
            return;
        }

        System.out.println(arr[n]);
        displayArrayInReverse(arr,n-1);
    }
}
