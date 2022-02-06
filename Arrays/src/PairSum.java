public class PairSum {
    public static void main(String[] args) {
        int[]arr={0,1,2,3,4,5};
        findPairbyTwoPointer(arr,5);
        findPair(arr,5);
    }
    static void findPair(int[]a,int sum){
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]+a[j]==sum){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
    static void findPairbyTwoPointer(int[]a,int sum){
        int i=0;
        int j=a.length-1;
        while(i<j){
            if (a[i]+a[j]<sum){
                i++;
            }else if(a[i]+a[j]>sum){
                j--;
            }else{
                System.out.println(a[i]+" "+a[j]);
                i++;
                j--;
            }
        }
    }
}
