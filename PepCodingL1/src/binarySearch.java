public class binarySearch {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        int n=2;
        int li=0;
        int hi=arr.length-1;
        int mi=(li+hi)/2;
        while(li<=hi){
            if (arr[mi]==n){
                System.out.println(mi);
                break;
            }
            else if(n>arr[mi]){
                li=mi+1;
            }
            else if(n<arr[mi]){
                hi=mi-1;

            }
            mi=(li+hi)/2;
        }
    }
}
