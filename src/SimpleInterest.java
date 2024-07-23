public class SimpleInterest {
    public static void main(String[] args) {
        int principal=2000;
        int time=2;
        int rate=12;

        //Calculate simple interest
        int interest=(principal*time*rate)/100;
        System.out.println("The simple interest is "+interest);
    }
}
