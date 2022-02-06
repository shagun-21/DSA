public class MissingPositiveInteger {
    public static void main(String[] args) {

    }

    static void segregates(int[]a){
        int i=0;
        for (int j=0;j<a.length;j++){
            if (a[j]<0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
    }
    static void findNumber(int[] a){

    }
}
