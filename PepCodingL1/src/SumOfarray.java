import java.util.Scanner;

public class SumOfarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int [] arr1=new int[n1];
        for (int i1=0;i1< arr1.length;i1++){
            arr1[i1]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int [] arr2=new int[n2];
        for(int i2=0;i2<arr2.length;i2++){
            arr2[i2]= sc.nextInt();
        }

        int []  arr3=new int[n1>n2?n1:n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=arr3.length-1;

    }
}
