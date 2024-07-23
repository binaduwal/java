public class MethodName {

    public static void main(String[] args) {
        Prime();

    }
//    public static void printName(){
//        System.out.println("Bina");
//    }
//
//    public static void evenNum(int start,int end){
//       for(int i=start;i<=end;i++){
//           if(i%2==0){
//               System.out.println(i + " is Even");
//           }
//       }
//    }

    public static void Prime() {
        int number = 29;
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
