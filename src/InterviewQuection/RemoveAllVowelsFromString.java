package InterviewQuection;

public class RemoveAllVowelsFromString {
    public static void main(String[] args) {
        String name="Java Concept Of The Day";
       name=name.replaceAll("[AEIOUaeiou]","");
        System.out.println(name);

    }
}
