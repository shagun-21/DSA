package recursion;

import java.util.Scanner;

public class firstIndexInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int elementToFind=sc.nextInt();

        int index=findfirstIndex(arr,0,elementToFind);
        System.out.println(index);
    }

    static int findfirstIndex(int[]arr,int idx,int x){
        if (idx==arr.length-1){
            return -1;
        }
        int fiisa=findfirstIndex(arr,idx+1,x);
        if (arr[idx]==x){
            return idx;
        }
        else{
            return fiisa;
        }
    }
}
