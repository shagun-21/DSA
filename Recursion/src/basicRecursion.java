public class basicRecursion {
    public static void main(String[] args) {
        //printNum(5);
        System.out.println(sum(4));
    }
    static void printNum(int a){
        System.out.println(a);
        if (a!=1){
            printNum(a-1);
        }

    }
    static int sum(int n ){
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
