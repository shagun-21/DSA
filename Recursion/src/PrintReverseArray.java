public class PrintReverseArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        PrintReverseArray(a,4);

    }
    static void PrintReverseArray(int[] arr, int idx){
        if (idx<0){
            return;
        }
        System.out.println(arr[idx]);
        PrintReverseArray(arr,idx-1);
    }
}
