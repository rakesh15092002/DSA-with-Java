package Strings;
import java.util.Scanner;
public class RemoveOuterMostParenthesis {
    public static String remove(String str ){
        int count=0;
        String ans = "";
        for(char ch : str.toCharArray()){
            if(ch == ')') count --;
            if(count!=0) ans += ch;
            if(ch =='(') count ++;
        }
        return ans;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = remove(str);
        System.out.println(res);
    }
}
