public class Prog1 {
    public static void main(String[] args) {
      //  printNum(10);
        print(10);
    }
    static void printNum(int n){
        System.out.println(n);
        if (n==0){
            return;
        }
            else{
            printNum(n-1);
        }

    }
    static void print(int n){
        System.out.println("hello world");
        if (n>=0){
            print(n-1);
        }

    }

}
