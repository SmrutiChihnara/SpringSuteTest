package ArrayExample;

import java.util.Arrays;

public class StringExample {

    public  static void SortInString()
    {
        String arr[]={"csd","aba","dfc","cdr"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println((int)arr[0].charAt(0));
    }

    public static void main(String[] args) {
        SortInString();
    }
}
