public class sumDigit {
    public static void main(String[] args) {
        System.out.println(sumdigit(126));
    }
    static int sumdigit(int n ){
        if (n==1){
            return 1;
        }
    return n%10 + sumdigit(n/10);
    }
}
