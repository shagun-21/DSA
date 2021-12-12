public class SelectionSort {
    public static void main(String[] args) {

        int[] arr={5,4,6,2,1,3};

        int n= arr.length;

        for(int i=0;i<n;i++){

            int min_i=i;
            for(int j=i+1;j<n;j++){

                if (arr[j]<arr[min_i]){

                    min_i=j;
                    //swap
                    int temp=arr[min_i];
                    arr[min_i]=arr[i];
                    arr[i]=temp;

                }
            }
        }
        //printing unsorted array
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
    }
}
