import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {
        //making object of scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name");
        String firstname=sc.nextLine();
        System.out.println("Enter last name");
        String lastname=sc.nextLine();
        System.out.println("Full name is "+firstname+ " "+lastname );
    }
}
