public class TwoSum {
    public static void main(String[] args) {
        int[]a={2,7,11,15};
        two_sum(a,9);

    }
    static int[] two_sum(int[]arr, int target){
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
