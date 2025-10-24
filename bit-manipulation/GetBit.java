//Get the 3rd Bit (Position = 2) of a number n .(n=0101).

class GetBit{
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int mask = 1 << pos;
        if((mask & n)==0){
            System.out.println("It is a 0");
        }else{
            System.out.println("It is a 1");
        }
    }
}