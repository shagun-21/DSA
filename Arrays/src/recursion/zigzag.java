package recursion;

import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        printZigZag(n);

    }
    static void printZigZag(int n){
        if (n==0){
            return;

        }
        System.out.print(n+" ");
        printZigZag(n-1);
        System.out.print(n+" ");
        printZigZag(n-1);
        System.out.print(n+" ");
    }
}
