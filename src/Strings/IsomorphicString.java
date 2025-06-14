package Strings;
import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
    public static boolean isomorphic(String s,String t){
        HashMap<Character,Character> map12 = new HashMap<>();
        HashMap<Character,Character> map21 = new HashMap<>();
        for(int i = 0 ; i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            // cheack that if ch1 is exist in map12 or not
            if(map12.containsKey(ch1)){
                // agar karta hai to ch1 ki value ch2 ke barabar hai ya nahi
                if(map12.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                map12.put(ch1,ch2);
            }

            // reverse se bhi cheak karo right to left
            if(map21.containsKey(ch2)){
                if(map21.get(ch2)!=ch1){
                    return false;
                }
            }
            else{
                map21.put(ch2,ch1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string first:");
        String str1 = sc.next();
        System.out.println("enter the string first:");
        String str2 = sc.next();
        System.out.println(isomorphic(str1, str2));

    }
}
