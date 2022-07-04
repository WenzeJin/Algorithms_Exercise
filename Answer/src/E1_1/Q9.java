package E1_1;
import java.util.*;

public class Q9
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s = "";
        for(int n = N; n > 0; n /= 2)
        {
            s = n%2 + s;
        }
        System.out.println(s);
        in.close();
    }
}