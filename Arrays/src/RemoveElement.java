import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr ={2,3,6,7,9,4};
        System.out.println("array after removal of element is"+ removeEle(arr,1));

    }
    static String removeEle(int[]a,int removeIndex){
        for (int i=removeIndex;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        return Arrays.toString(a);
        // the last and second last element would be same since we cannot alter the size of the array
    }
}
