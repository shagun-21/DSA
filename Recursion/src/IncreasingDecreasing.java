public class IncreasingDecreasing {
    public static void main(String[] args) {
       IncreasingDecreasing(5);

    }
    static void IncreasingDecreasing(int n ){
        if(n==0){
            return ;
        }
        System.out.println(n);
        IncreasingDecreasing(n-1);
        System.out.println(n);
    }



    }

