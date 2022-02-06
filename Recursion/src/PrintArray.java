public class PrintArray {
    public static void main(String[] args) {
        int[]a ={1,2,3,4,5};
        PrintArray(a,0);

    }
    static void PrintArray(int[] arr, int idx){
        if (idx==arr.length){
            return;

        }
        System.out.println(arr[idx]);
        PrintArray(arr,idx+1);
    }
}
