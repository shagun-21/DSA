public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int srch=1;
        int li=0;
        int hi=arr.length-1;
        int mi=(li+hi)/2;
        while(li<=hi){
            if (arr[mi]==srch){

                System.out.println("element found at index "+mi);
                break;
            }
            else if(srch<arr[mi]){
                hi=mi-1;
            }
            else{
                li=mi+1;
            }
            mi=(li+hi)/2;
        }
        if(li>hi){

        }
    }
}
