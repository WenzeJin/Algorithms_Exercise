package E1_1;

public class Q7a {
    public static void main(String[] args) {
        double t = 9.0;
        while(Math.abs(t - 9.0/t) > 0.001){t = (9.0/t + 1) / 2.0;}
        System.out.printf("%.5f\n",t);
    }
}
