import java.util.Scanner;
public class MyMath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a: ");
        int a = s.nextInt();
        System.out.print("b: ");
        int b = s.nextInt();
        System.out.println("Greatest common factor: " + greatestCommonFactor(a, b));
    }
    public static int greatestCommonFactor(int a, int b) {
        while (b != 0) {
            if (a > b) {
                int c = b;
                b = a % b;
                a = c;
            } else {
                b = b % a;
            }
        }
        return a;
    }
}