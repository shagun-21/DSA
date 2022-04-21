public class BrokenEconomy {
    public static void main(String[] args) {
        int [] a={5,10,15,20,25};
        int floor=Integer.MIN_VALUE;
        int ceil=Integer.MAX_VALUE;
        int li=0;
        int data=12;
        int hi=a.length-1;

        while(li<=hi){
            int mi=(li+hi)/2;
            if(data<a[mi]){
                hi=mi-1;
                ceil=a[mi];
            }
            else if(data>a[mi]){
                li=mi+1;
                floor=a[mi];

            }
            else{
                floor=ceil=a[mi];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
