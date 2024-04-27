public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd(15,12));
        System.out.println(lcm(15,12,gcd(15, 12)));
    }
    static int gcd(int n1,int n2){

        while(n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
         return n1;
    }
    static int lcm(int n1,int n2,int gcd){
        return (n1*n2)/gcd;

    }
}
