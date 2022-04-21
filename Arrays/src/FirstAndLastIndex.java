import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        int li=0;
        int hi=a.length-1;
        int fi=-1;
        while(li<=hi){
           int mi=(li+hi)/2;
           if (data>a[mi]){
               li=mi+1;
           }
           else if(data<a[mi]){
                    hi=mi-1;
           }
           else{
               fi=mi;
               hi=mi-1;
           }
        }
        System.out.println(fi);
         li=0;
         hi=a.length-1;
        int lai=-1;
        while(li<=hi){
            int mi=(li+hi)/2;
            if (data>a[mi]){
                li=mi+1;
            }
            else if(data<a[mi]){
                hi=mi-1;
            }
            else{
                lai=mi;
                li=mi+1;
            }
        }
        System.out.println(lai);
    }
}
