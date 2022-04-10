import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        countCharacters(s);

    }
    static void countCharacters(String str){
        /*int[] arr = new int[26];
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


        }*/

        int[] arr=new int[26];
        for (int i=0;i<str.length();i++){
            char x=str.charAt(i);
            int index=x-'a';
            arr[index]+=1;
        }
        int max=arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                /*char ans=(char)('a'+i);
                System.out.println(ans+":"+arr[i]);*/
                if (arr[i]>max){
                    max=arr[i];
                }
                int result=max;
                System.out.println(str.charAt());
            }
        }
    }
}
