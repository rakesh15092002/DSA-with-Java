package Strings;

public class rotatedStringOrNot {
    
    public static String rotateByOne(String str){
        if(str == null || str.length() <= 1) return str;
        return str.substring(1) + str.charAt(0);
    }

    public static boolean isRotated(String str, String goal){
        if (str == null || goal == null || str.length() != goal.length()) return false;

        String rotated = str;
        for(int i = 0 ; i < str.length(); i++){
            rotated = rotateByOne(rotated);  // rotate previous result
            if(rotated.equals(goal)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abcd";
        String goal = "cdab";

        if (isRotated(str, goal)) {
            System.out.println(goal + " is a rotation of " + str);
        } else {
            System.out.println(goal + " is NOT a rotation of " + str);
        }
    }
}

// other logic is abcd+abcd = abcdabcd me cdab kahi dikh raha hai agr han to return true warna false
// return (str+str).containsKey(goal)
