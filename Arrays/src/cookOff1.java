import java.util.Scanner;

public class cookOff1 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int t=sc.nextInt();
            String input = sc.nextLine();    // get the entire line after the prompt
            String[] numbers = input.split(" "); // split by spaces

            for (int i=0;i<t;i++){

                int X = Integer.parseInt(numbers[0]);
                int Y = Integer.parseInt(numbers[1]);
                int Z = Integer.parseInt(numbers[2]);
                if(Y<=X){
                    System.out.println("PIZZA ");
                }
                else if(Z<=X){
                    System.out.print("BURGER");
                }
                else{
                    System.out.print("NOTHING");
                }
            }
        }
    }


