import java.util.Scanner;

public class Leapyear
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year= sc.nextInt();
    /*
    *   if (year % 4 ==0){
            if (year % 100 ==0){
                if (year % 400 ==0){
                    System.out.println("leap year");
                }
                else{
                    System.out.println("not leap year");
                }
            }
            else{
                System.out.println("leap year");
            }
        }
        else{
            System.out.println("not a leap year");
        }*/
        if((year % 400==0) || (year % 4==0) && (year % 100 !=0) ){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }

}
