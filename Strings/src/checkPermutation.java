public class checkPermutation {
    public static void main(String[] args) {
        System.out.println(checkPerm("abc","bca"));

    }
    static boolean checkPerm(String str1,String str2){
        int[] arr = new int[26];
        for (int i=0;i<str1.length();i++){
            char x=str1.charAt(i);
            int index=x-'a';
            arr[index]+=1;

        }
        for (int i=0;i<str2.length();i++){
            char x=str2.charAt(i);
            int index=x-'a';
            arr[index]-=1;

        }
        for(int i=0;i< arr.length;i++){
            if (arr[i]!=0){
                return false;
            }
        }
        return true;

        }
    }

