public class UniqueElement {
    public static void main(String[] args) {
        int[] arr ={2,3,4,1,2,3,4,};
        uniqueElement(arr);

    }
   /* static int uniqueElement(int[] a){
        int x=0;
        for(int i=0;i<a.length;i++){
            x=x^a[i];
        }
        return x;
    }*/

    //Brute force approach
    static void uniqueElement(int[] a){

        for (int j : a) {
            int c=0;
            for (int k : a) {
                if (j == k) c++;
            }
            if (c == 1) {
                System.out.println(j);
            }
        }
    }
}
