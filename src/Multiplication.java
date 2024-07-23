//public class SumOfNaturalNum {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=num;i++){
//            sum+=i;
//        }
//        System.out.println("Sum of "+ num +" is "+sum);
//    }


//public class Multiplication{
//public static void main(String[] args) {
//        int number=5;
//        for(int i=1;i<=10;i++)
//        {
//            int mul=number*i;
//            System.out.println(number+i+"="+mul);
//        }
//
//    }
//}

public class Multiplication{
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<=10;j++){

                int result=i*j;
                System.out.println(i+"*"+j+"="+result);

            }
            System.out.println("-------------------");
        }
    }
}