import java.util.Scanner;

public class print_decreasing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        print_decreasing(n);

    }
    static void print_decreasing(int n){

        if(n<1){
            return ;
        }
        System.out.println(n);
        print_decreasing(n-1);
    }
}
