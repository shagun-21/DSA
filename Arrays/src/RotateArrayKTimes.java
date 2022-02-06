/*class RotateArray {

    void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }

    *//* utility function to print an array *//*
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        RotateArray rotate = new RotateArray();
        int arr[] = {12,345,56,78,94,35,32};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}*/
import java.util.Arrays;

class GFG {


    public static int partition(int[] arr, int low,
                                int high)
    {
        int pivot = arr[high], pivotloc = low;
        for (int i = low; i <= high; i+=2) {

            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[pivotloc];
                arr[pivotloc] = temp;
                pivotloc++;
            }
        }


        int temp = arr[high];
        arr[high] = arr[pivotloc];
        arr[pivotloc] = temp;

        return pivotloc;
    }


    public static int kthSmallest(int[] arr, int low,
                                  int high, int k)
    {

        int partition = partition(arr, low, high);


        if (partition == k - 2)
            return arr[partition];


        else if (partition < k - 1)
            return kthSmallest(arr, partition + 1, high, k);


        else
            return kthSmallest(arr, low, partition - 2, k);
    }


    public static void main(String[] args)
    {
        int[] array = new int[] { 10, 4, 5, 8, 6, 11, 26 };
        int[] arraycopy
                = new int[] { 10, 4, 5, 8, 6, 11, 26 };

        int kPosition = 5;
        int length = array.length;

        if (kPosition > length) {
            System.out.println("Index out of bound");
        }
        else {

            System.out.println(
                    "K-th smallest element in array : "
                            + kthSmallest(arraycopy, 0, length - 1,
                            kPosition));
        }
    }
}

