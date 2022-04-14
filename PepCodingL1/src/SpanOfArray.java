import java.util.Arrays;
import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int minimum=findMin(arr);
        int maximum=findMax(arr);
        int span=maximum-minimum;
        System.out.println(span);

    }

    static int findMin(int[]arr){

        int min=arr[0];
        for (int j=0;j<arr.length;j++){
            if (arr[j]<min){
                min=arr[j];
            }
        }
        return min;
    }
    static int findMax(int[]arr){

        int max=arr[0];
        for (int j=0;j<arr.length;j++){
            if (arr[j]>max){
                max=arr[j];
            }
        }
        return max;
    }
}
