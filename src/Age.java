import java.util.Scanner;
import java.time.Year;
public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter birth year in A.D");
        int year=sc.nextInt();
        int current=Year.now().getValue();
        int age=current-year;
        System.out.println("you're " +age +" years old");
    }
}
