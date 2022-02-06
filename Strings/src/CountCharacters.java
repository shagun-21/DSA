public class CountCharacters {
    public static void main(String[] args) {

        String s="aabcd";
        countCharacters(s);

    }
    static void countCharacters(String str){
        int[] arr = new int[26];
        for (int i=0;i<str.length();i++){
            char x=str.charAt(i);
            int index=x-'a';
            arr[index]+=1;

        }
        for (int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               char ans=(char)('a'+i);
               System.out.println(ans+":"+arr[i]);

           }


        }
    }
}
