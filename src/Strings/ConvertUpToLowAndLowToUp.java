package Strings;
import java.util.Scanner;
public class ConvertUpToLowAndLowToUp {
    public static String convert(String str){
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii >= 65 && ascii <=90){
                ascii +=32;
                res.append((char)ascii);
            }
            else if(ascii >= 97 && ascii <=122){
                ascii -= 32;
                 res.append((char)ascii);
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str = sc.nextLine();
        System.out.println(convert(str));
        
    }
}

/*package Strings;
import java.util.Scanner;

public class ConvertUpToLowAndLowToUp {
    public static String convert(String str) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if(Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Non-alphabetical characters remain unchanged
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str = sc.nextLine();
        System.out.println(convert(str));
    }
}
 */