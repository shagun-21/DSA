import java.util.Scanner;

public class Tower_of_hanoi {

    public static void main(String[] args) {

            toh(3,11,12,13);
    }
    static void toh(int disk,int t1,int t2,int t3){
        if (disk==0){
            return ;
        }
        toh(disk-1,t1,t3,t2);
        System.out.println(disk + "[" + t1  + " -> " +t2);
        toh(disk-1,t3,t2,t1);
    }
}
