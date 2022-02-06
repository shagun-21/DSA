public class MaximumInArray {
    public static void main(String[] args) {
        int[] a = {7,9,76,53};
        System.out.println(FindMax(a,0));

    }
    static int FindMax(int[]arr, int idx){
        if (idx==arr.length-1){
            return arr[idx];
        }
        int max = FindMax(arr,idx+1);


            if (max > arr[idx]){
                return max;
            }
            else {
                return arr[idx];
            }
    }
}
