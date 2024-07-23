import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
       char ch =sc.next().charAt(0);
       if('a'== ch || 'e'==ch||'i'==ch||'o'==ch||'u'==ch){
           System.out.println("Vowel");
       }
       else if(ch>='a'&&ch<='z'){
           System.out.println("Consonant");
       }
else {
           System.out.println("Not valid alphabet");
       }
    }
}
