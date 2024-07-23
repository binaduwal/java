import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        double number = sc.nextDouble();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");

        } else {
            System.out.println("Zero");
        }
    }
}
