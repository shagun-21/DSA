import java.util.Arrays;

public class string_anagram {
    public static void main(String[] args) {
        String str1= "slent";

        String str2= "listen";

        System.out.println(anagram(str1, str2));
        
    }
    static boolean anagram(String s1,String s2){
     int  n1=s1.length();
     int  n2=s2.length();

      if(n1!=n2) return false;

      char[] a1=s1.toCharArray();
      Arrays.sort(a1);

      char[] a2= s2.toCharArray();
      Arrays.sort(a2);

      for(int i=0;i<a1.length;i++){
        if(a1[i]!=a2[i]){
            return false;
        }
      }

      return true;
    }
}


    

