import java.util.Arrays;

public class SegregateArray {
    public static void main(String[] args) {
        int[]arr={-1,2,-1,3,-1,4};
        segregates(arr);


    }
    static void segregates(int[]a){
        int i=0;
        for (int j=0;j<a.length;j++){
            if (a[j]<0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }

        }
        for (int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}
