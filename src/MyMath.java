import java.util.Scanner;
public class MyMath {
    public static void main(String[] args) {
        Scanner mathInput = new Scanner(System.in);
        System.out.print("Number: ");
        int first = mathInput.nextInt();
        System.out.print("Number: ");
        int second = mathInput.nextInt();
        System.out.println("Greatest common factor: " + greatestCommonFactor(first, second));
    }
    public static int greatestCommonFactor(int num1, int num2) {
        while (num2 != 0) {
            if (num1 > num2) {
                int num3 = num2;
                num2 = num1 % num2;
                num1 = num3;
            } else {
                num2 = num2 % num1;
            }
        }
        return num1;
    }
}