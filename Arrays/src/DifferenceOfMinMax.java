public class DifferenceOfMinMax {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int max =findMax(arr);
        int min =FindMib(arr);
        System.out.println("The difference of min and max is " + (max-min));
    }

    static int findMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }

    static int FindMib(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
