public class IsFibonnacci {
    public static void main(String[] args) {
        int[]arr={0,1,1,2,3,5,8,13};
        System.out.println(IsFibbo(arr));

    }
    static boolean IsFibbo(int[]a){
        for (int i=2;i<a.length;i++){
            if (a[i]!=a[i-1]+a[i-2]){
                return false;

            }

        }
        return true;
    }
}
