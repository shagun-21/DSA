public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        System.out.println(IsSorted(arr));

    }
    static boolean IsSorted(int[] a){
       for(int i=1;i<a.length;i++){
           if (a[i]<a[i-1]){
               return false;
           }
       }
       return true;
    }
}
