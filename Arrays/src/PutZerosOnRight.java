public class PutZerosOnRight {
    public static void main(String[] args) {
        int[]arr={2,3,0,6,0,7};
        putZeros(arr);

    }
    static void putZeros(int[]a){
        int i=0;
        for (int j=0;j<a.length;j++){
            if (a[j]!=0){
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
        for (int k:a){
            System.out.println(k);
        }
    }
}
