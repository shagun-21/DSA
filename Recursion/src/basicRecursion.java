public class basicRecursion {
    public static void main(String[] args) {
        printNum(5);
    }
    static void printNum(int a){
        System.out.println(a);
        if (a!=1){
            printNum(a-1);
        }

    }
}
