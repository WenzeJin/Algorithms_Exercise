package E1_1;
import java.util.*;

public class Q21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please input count:\n");
        int n = in.nextInt();
        String[] name = new String[n];
        int[] num1 = new int[n];
        int[] num2 = new int[n];
        for(int i = 0; i < n; i++)
        {
            name[i] = in.next();
            num1[i] = in.nextInt();
            num2[i] = in.nextInt();
        }
        in.close();
        for(int i = 0; i < n; i++)
        {
            System.out.printf("%s %d %d %.3f%n", name[i], num1[i], num2[i], ((double)num1[i])/num2[i]);
        }
    }
}
