public class Factorial {
    public static void main(String[] args) {
        System.out.println( factorial(6)
        );

    }
    static int factorial(int n){
        if (n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        return n * factorial(n-1);
    }
}
