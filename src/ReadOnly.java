import java.util.*;
public class ReadOnly {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList();

        //Adding elements to originalList

        originalList.add("John");

        originalList.add("Carlos");

        originalList.add("David");

        originalList.add("Ian");

        originalList.add("Daniel");
        List<String >unmodifly=Collections.unmodifiableList(originalList);
        try {
            unmodifly.add("hello");
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
        System.out.println(unmodifly);
    }
}
