import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("1.ADD");
        System.out.println("2.SUBTRACT");
        System.out.println("3.MULTIPLY");
        System.out.println("4.DIVIDE");
        System.out.println("Choose the number:");
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Sum is "+(num1+num2));
                break;

            case 2:
                System.out.println("Subtraction is "+(num1-num2));
                break;

            case 3:
                System.out.println("Division"+num1*num2);
                break;

            case 4:
                System.out.println("Division is" +num1/num2);
                break;


        }
    }
}
