public class RemoveWs {
    public static void main(String[] args) {
        String text="hello bina";
        String result=text.replaceAll("\\s","");
        System.out.println(result);
    }
}
