public class FindMax {
    public static void main(String[] args) {
        int[] arr ={2,5,8,9,10};
        System.out.println(findMax(arr));
    }
    static int findMax(int[] a){
        int max =a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
