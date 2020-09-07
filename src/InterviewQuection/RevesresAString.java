package InterviewQuection;

public class RevesresAString {
    public static void main(String[] args) {
        String name="hello";
        String rev=new StringBuffer(name).reverse().toString();
        System.out.println(rev);
    }
}
