package recursion;

import java.util.Scanner;

public class printIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        IncreasingDecreasing(n);


    }
    static void IncreasingDecreasing(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        IncreasingDecreasing(n-1);
        System.out.println(n);
    }
}
