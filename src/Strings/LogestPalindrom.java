package Strings;
public class LogestPalindrom {
    public static boolean isPalindrom(String str){
        char [] newStr = str.toCharArray();
        int n = newStr.length;
        for(int i = 0 ; i<n/2 ; i++){
            if(newStr[i]!=newStr[n-1-i]){
                return false;
            }
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        String res = "";
        int maxi = 0;
        for(int i = 0  ; i<s.length() ; i++){
            for(int j = i ; j < s.length() ;j++){
                String str = s.substring(i,j+1);
                if(isPalindrom(str)&& maxi < str.length()){
                   res = str;
                   maxi = str.length();
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longestPalindrome(str));
    }
}
