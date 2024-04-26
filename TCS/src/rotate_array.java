public class rotate_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        rotateByd(arr, 2);
        for(int val:arr){
            System.out.print(val+" ");
        }

    }
    //left rotate by one place
    static int[] rotate (int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];

        }
        arr[arr.length-1]=temp;
        return arr;
    }
    //left rotate by d places
    static int[] rotateByd(int[] a,int d){
        
        int n=a.length;
        d=d%a.length;

        int[] temp= new int[d];

        for(int i=0;i<d;i++){
            temp[i]=a[i];
        }

        for(int i=d;i<n;i++){
            a[i-d]=a[i];
        }

        for(int i=n-d;i<n;i++){
            a[i]=temp[i-(n-d)];
        }
        return a;
    }
}
