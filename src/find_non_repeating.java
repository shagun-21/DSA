import java.util.*;
public class find_non_repeating {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,3,4};
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }else{
                mp.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
