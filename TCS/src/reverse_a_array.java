public class reverse_a_array {
public static void main(String[] args) {
    int[] a={1,2,3};

    int s=0;
    int e=a.length-1;

    while(s<e){
        int temp=a[e];
        a[e]=a[s];
        a[s]=temp;
        s++;
        e--;
    }
    for(int val:a){
        System.out.println(val+" ");
    }
    System.out.println("mean is"+findMean(a));
}
static int findMean(int[ ] a){
    int sum=0;
    for(int val:a){
        sum+=val;
    }

    int mean=sum/a.length;
    return mean;
}
}
