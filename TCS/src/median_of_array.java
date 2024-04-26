public class median_of_array {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};

        if(arr.length%2!=0){
            System.out.println(arr[arr.length/2]);
        }
        else{
            System.out.println((double)((arr[arr.length-1]/2)+(arr[arr.length/2]))/2);
        }
    }
    
}
