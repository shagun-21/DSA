import java.util.Scanner;

public class findElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        for (int j=0;j< arr.length;j++){
            if (arr[j]==element){
                System.out.println(j);
                return;
            }
        }
        System.out.println("-1");

    }
}
