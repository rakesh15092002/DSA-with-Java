package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static String commonPre(String [] str){
        StringBuilder res = new StringBuilder();
        Arrays.sort(str);
        char [] first = str[0].toCharArray();
        char [] second = str[str.length-1].toCharArray();
        for(int i = 0 ; i<first.length-1;i++){
            if(first[i]!=second[i]){
                return res.toString();
            }
            res.append(first[i]);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arrays:");
        int n = sc.nextInt();
          sc.nextLine(); // ✅ consume leftover newline

        String[] str = new String[n];
        System.out.println("Enter the String of Array:");
        for(int i = 0; i<n ;i++){
            str[i] = sc.nextLine();
        }
        System.out.println( commonPre(str));
       
    }
}
