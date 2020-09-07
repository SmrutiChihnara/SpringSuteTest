package InterviewQuection;

import java.util.*;

public class SortUse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Virat");

        list.add("rohit");

        list.add("Shikar");

        list.add("ashwin");

        list.add("ravindra");

        list.add("Bhargav");
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);
        int a='a';
        int A='A';
        System.out.println(a+""+A);

    }
}
