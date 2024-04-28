public class print_subarray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        // printAllSubArray(arr);
        System.out.println(subArraySum(arr));
        
        
    }
    static void printAllSubArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    } 
    static int subArraySum(int[] arr){

        //brute force approach
        int maxSum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){ 
                    sum+=arr[k];
                }
                maxSum=Math.max(maxSum, sum);
                
            }
        }
        return maxSum;

        //cumulative sum approach 
        
        


    }
}
