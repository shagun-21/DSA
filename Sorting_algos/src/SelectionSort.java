public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={5,4,1,2};
        SelectionSort(arr);
        for (int k:arr){
            System.out.println(k);
        }

    }
    static void SelectionSort(int[]a){
        for (int i=0;i<a.length;i++){
            int minE=a[i];
            int minI=i;
            for (int j=i;j<a.length;j++){
                if (a[j]<minE){
                    minE=a[j];
                    minI=j;

                }
            }

            int temp=a[i];
            a[i]=a[minI];
            a[minI]=temp;
        }


    }
}
