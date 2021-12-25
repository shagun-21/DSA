import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println("1) Area of square");
        System.out.println("2) Area of rectangle");
        System.out.println("3) Area of circle");
        System.out.println("4) Area of equilateral triangle");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option){
            case 1 :{
                System.out.println("enter the side of the square");
                int side = sc.nextInt();
                System.out.println("the area of square is " + side*side);
                break;
            }
            case 2:{
                System.out.println("enter the length and breadth of rectangle ");
                int l=sc.nextInt();
                int b=sc.nextInt();
                System.out.println("the area of rectangle is "+ l*b);
                break;
            }
            case 3:{
                System.out.println("enter the radius of circle");
                int r = sc.nextInt();
                System.out.println("area of circle is " + 3.14*r*r);
                break;
            }
            case 4: {
                System.out.println("enter the side of triangle");
                Float a=sc.nextFloat();
                System.out.println("the area of triangle is "+ (1.73/4)*a*a);
                break;

            }
            default:
                System.out.println("invalid input");
        }

    }
}
