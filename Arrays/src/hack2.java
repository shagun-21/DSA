import java.util.Scanner;

public class hack2

{

    public static void main(String[] args)

    {

        Scanner ab = new Scanner (System.in);
        int r =ab.nextInt();

        int ar[][] = new int[r][r];

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<r; j++)
            {

                ar[i][j] = ab.nextInt();
            }}

        int sum1 =0;

        for(int i=0; i<r; i++)

        {

            for(int j=0; j<r; j++)

            {

                if(i==j)

                {

                    sum1 = sum1 + ar[i][j];

                }}}

        int sum2 = 0;

        int e = r+1;

        for(int i=0; i<r; i++)

        {

            for(int j=0; j<r; j++)

            {

                if(i==r-j-1)

                {

                    sum2 = sum2 + ar[i][j];

                }}}


        int sum = sum1-sum2;

        System.out.println(sum);





    }

}