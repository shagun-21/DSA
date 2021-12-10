public class FindAvg {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};

        System.out.println(findAvg(arr));
    }
    static int findAvg(int[] a){
        int sum=0;
        int l=a.length;
        for (int i=0;i<a.length;i++){
            sum =sum+a[i];

        }
        return sum/l;
    }
}
