public class findMin {
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] a){
        int min=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
}
