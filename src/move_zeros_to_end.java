public class move_zeros_to_end {
    public static void main(String[] args) {
        int[] a={0,1,0,2};
        moveZeros(a);
        for(int val:a){
            System.out.print(val+" ");
        }
        
    }
    static int[] moveZeros(int[] arr){
        int s=0;
        for(int e=1;e<arr.length;e++){
            if(arr[e]!=0){
                int temp=arr[e];
                arr[e]=arr[s];
                arr[s]=temp;
                s++;
                
            }
        }
        
        return arr;
    }
}
