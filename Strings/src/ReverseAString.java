public class ReverseAString {
    public static void main(String[] args) {
        String str="shagun";
        String str1="";
        for (int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
    }
}
