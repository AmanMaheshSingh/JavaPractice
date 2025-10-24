//Clear the 3rd Bit (Position = 2) of a number n .(n=0101).

class ClearBit{
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int mask = 1 << pos;
        int clear = (~mask)&n;
        System.out.println(clear);
    }
}