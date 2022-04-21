package recursion;

import java.util.Scanner;

public class displayAarray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        displayArray(a,0);


    }
    static void displayArray(int[] n,int sp){
        if (sp==n.length){
            return;
        }
        System.out.println(n[sp]);
        displayArray(n,sp+1);

    }
}
