import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = n;
        int sum = 0;
        while (k > 0) {
            int r = k % 10;
            k /= 10;
            sum += (int) (Math.pow(r, (int) (Math.log10(n) + 1)));
        }
        if (n == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}