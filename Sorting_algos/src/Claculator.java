import java.util.Scanner;

public class Claculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Enter the operation type");
        String sym=sc.next();
        int res;
        switch (sym){
            case "+" : res =num1+num2;
                System.out.println("Result is "+ res);
                break;

            case "-" : res =num1-num2;
                System.out.println("Result is "+res);
                break;

            case "*" : res=num1*num2;
                System.out.println("Result is "+res);
                break;

            case "/" : res=num1/num2    ;
                System.out.println("Result is "+res);
                break;

            default:
                System.out.println("invalid opertion");



        }

    }
}
