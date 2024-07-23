import java.util.Scanner;
public class RoundDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        double decimal=sc.nextDouble();
        System.out.println("Enter the number of decimal places");
        int n=sc.nextInt();

        //calculate factor to shift decimal places
        double factor=1;
        for(int i=0;i<n;i++){
          factor*=10;
        }
        //perform rounding
        double tempNum=decimal*factor;
        double roundNum=Math.round(tempNum);
        double result=roundNum/factor;
        System.out.println("The result is "+result);
    }
}
