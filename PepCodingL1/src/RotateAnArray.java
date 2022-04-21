import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int [] a={1,2,3,4,5};
        rotate(a,k);
        for (int val:a){
            System.out.println(val);
        }


    }
   private static void reverse(int[]a,int i,int j){

        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    private static void rotate(int []a,int k){
        k=k%a.length;
        //part1
        reverse(a,0,a.length-k-1);

        //part2
        reverse(a,a.length-k,a.length-1);

        //part3
        reverse(a,0,a.length-1);
    }
}
