//print table of Entered Number
import java.io.*;


class Qs6{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1 ; i <=10 ; i++){
            int t = N*i;
            System.out.println(N + " x " + i + " = " + t);
        }

        bufferedReader.close();
    }
}