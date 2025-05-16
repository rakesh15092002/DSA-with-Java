package Strings;
import java.util.Scanner;
public class RemoveOuterMostParenthesis {
    public static String removeOuterParen(String str){
        int count = 0;
        String res = "";
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch ==')') count--;
            if(count >0 ) res += ch; 
            if(ch=='(') count ++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(removeOuterParen(str));
        
    }
}
