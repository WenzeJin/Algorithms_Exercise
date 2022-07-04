package E1_1;
import java.util.*;

public class Q3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a == b && b == c) {System.out.println("equal");}
        else System.out.println("not equal");
        in.close();
    }
}
