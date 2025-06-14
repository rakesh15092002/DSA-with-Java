package Strings;

import java.util.Scanner;

public class Anagram {
    public static boolean angramOrNot(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        // method 1 use backet to strore the frequency of the character
        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();

        int [] bucket = new int[26];

        // fill the buckets
        for(int i = 0 ; i<str1.length();i++){
            bucket[str1.charAt(i)-'a']++;
        }
        // empty the buckets
        for(int i = 0 ; i<str2.length() ;i++){
            bucket[str2.charAt(i)-'a']--;
        }

        for(int i : bucket){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String:");
        String str1 = sc.next();
        System.out.println("Enter the second String:");
        String str2 = sc.next();
        System.out.println(angramOrNot(str1, str2));
    }
}
