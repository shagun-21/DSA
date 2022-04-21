public class InverseOfArray {
    public static void main(String[] args) {
        int[]a={3,4,1,2,0};
        int [] arr=inverse(a);
        for(int val:arr) System.out.println(val);



    }
    private static int[] inverse (int []a){
        int []inv =new int[a.length];
        for (int i=0;i<a.length;i++){
            int val=a[i];
            inv[val]=i;
        }
        return inv;
    }
}
