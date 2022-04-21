package recursion;

import java.util.Scanner;

public class maxOfArray {
    public static void main(String[] args) {

        int[]arr={1,2,3,4,5};
        int max=maxOfarray(arr,0);
        System.out.println(max);

    }
    static int maxOfarray(int[]a,int idx ){
        if (idx==a.length){
            return -1;
        }
        int max=maxOfarray(a,idx+1);
        if (a[idx]>max){
            return a[idx];
        }
        else{
            return max;
        }
    }

}
