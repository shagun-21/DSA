public class print_fibonacci {
    public static void main(String[] args) {
        int n=8;
        int a=0,b=1;
        int c=a+b;
        
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
