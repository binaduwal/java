import java.util.Scanner;
public class MultiplyFloat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        float num1= sc.nextFloat();
        System.out.println("Enter another number");
        float num2=sc.nextFloat();

        //multiplying
         float  mul=num1*num2;
        System.out.println("Multiplication is "+mul);

    }
}
