public class FirstOccurrenceInArray {
    public static void main(String[] args) {
            int[]arr={2,3,4,2,6};
        System.out.println(occurrence(arr,6,0));
    }

    static int occurrence(int[] a, int data, int idx) {
        if (idx == a.length - 1) {
            return idx;
        }

        int fioo = occurrence(a, data, idx + 1);
        if (a[idx] == data) {
            return idx;
        } else {
            return fioo;
        }

    }
}
