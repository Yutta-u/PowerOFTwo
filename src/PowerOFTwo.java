import java.util.Scanner;

public class PowerOFTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long x = 1;
        long b = 1;
        while (b * x <= a) {
            System.out.println(b * x);
            b = b * 2;
        }
    }
}
