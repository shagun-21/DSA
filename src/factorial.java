public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(20));
    }
    static long fact(int n){
        if(n==0) return 1;

        return n*fact(n-1);
    }
    
}
