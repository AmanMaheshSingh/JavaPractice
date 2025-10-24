//Set the 2nd Bit (Position = 1) of a number n .(n=0101).

class SetBit{
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1;
        int mask = 1 << pos;
        int set = mask | n;
        System.out.println(set);
    }
}