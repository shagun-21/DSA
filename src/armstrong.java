public class armstrong {
    public static void main(String[] args) {
        int n=153;
        int power=0;
        double sum=0;
        int t=n;
        int t2=n;

        while(n!=0){
            int rem=n%10;
            power++;
            n/=10;
        }
        
        while(t!=0){
            int rem=t%10;
            
            sum+=Math.pow(rem, power);
            
            t/=10;
        }
        
        if(sum==t2){
            System.out.println("true");
        }else System.out.println("false");
    }
}
