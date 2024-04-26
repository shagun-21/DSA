package recursion;

import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int elementToFind=sc.nextInt();

        int index=lastIndex(arr,0,elementToFind);
        System.out.println(index);
    }
    static int lastIndex(int[]arr,int idx,int x){
        if (idx==arr.length-1){
            return -1;
        }
        int liisa=lastIndex(arr,idx+1,x);
        if (liisa==-1){
            if (arr[idx]==x){
                return idx;
            }
            else{
                return liisa;
            }
        }
        else{
            return liisa;
        }
    }
}
