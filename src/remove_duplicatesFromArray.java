import java.util.*;
public class remove_duplicatesFromArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5};

        Set<Integer> set= new HashSet<>();
        for(int val:arr){
            set.add(val);
        }

        int[] temp = new int[set.size()];
        int index=0;
        for(int ele:set){
            temp[index++]=ele;
        }

        for(int e:temp){
            System.out.print(e+" ");
        }
    }
}
