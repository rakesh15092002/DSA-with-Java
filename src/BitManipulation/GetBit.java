package BitManipulation;

public class GetBit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;
        int getBit = bitMask & n;
        if(getBit == 0) {
            System.out.println("bit is zero : " + getBit);1`
        }
        else{
            System.out.println("bit is non -zero : " + getBit);
        }
    }
}
