package E1_1;
import java.util.*;


public class Q20 {
    public static double ln(int N)
    {
        if(N > 0){return Math.log(N) + ln(N-1);}
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.printf("%f\n",ln(N));
        in.close();
    }
}
