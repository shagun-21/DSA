import java.util.Scanner;

public class checkPerm2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String s1=sc.next();
        System.out.println("Enter second string");
        String s2=sc.next();
        System.out.println(checkPerm(s1,s2));

    }
    static boolean checkPerm(String str1,String str2){
        int[]arr =new int[26];
        for(int i=0;i<str1.length();i++){
            char x=str1.charAt(i);
            int index=x-'a';
            arr[index]+=1;
        }

        for (int j=0;j<str2.length();j++){
            char k=str2.charAt(j);
            int index2 =k-'a';
            arr[index2]-=1;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                return false;
            }

        }
        return true;
    }
}
