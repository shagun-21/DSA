public class is_number_palindrome {
    public static void main(String[] args) {
        int n=-55;
        int temp=n;
        int rev=0;

        if(n<0){
            System.out.println("false");
            return ;
        }

        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev) System.out.println("true");
        else{
            System.out.println("false");
        }
    }
    
}
