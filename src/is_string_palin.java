public class is_string_palin {
    public static void main(String[] args) {
        
        String s="al";
        String rev="";
        System.out.println(isPalindrome("shagun"));

        // for(int i=s.length()-1;i>=0;i--){
        //     rev=rev+s.charAt(i);
        // }
        // if(s.equals(rev)){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }
    }
    static boolean isPalindrome(String str){

        if(str.length()==1) return true;
        if(str.length()%2!=0){
            return false;
        }
        int s=0;
        int e=str.length()-1;

        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;

    }
}
