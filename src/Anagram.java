import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="abcd";String s2="ABCD";
        s1=s1.replaceAll("\\s","");
        s2=s2.replaceAll("\\s","");
        if(s1.length()==s2.length())
        {
         if(Arrays.equals(s1.toLowerCase().toCharArray(),s2.toLowerCase().toCharArray())==true)
            {
                System.out.println("anram");
            }
         else System.out.println("not ");

        }
        else System.out.println("not");
    }
}
