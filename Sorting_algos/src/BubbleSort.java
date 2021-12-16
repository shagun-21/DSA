public class BubbleSort {
    public static void main(String[] args) {
        int []a={29,36,7,14,9};
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int s=0;s<a.length;s++){
            System.out.println(a[s]);
        }
    }
}
