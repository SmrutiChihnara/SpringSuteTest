import java.util.Arrays;

public class ReverseASentenceWordByWord {

    public static int swap(String a, String b, int length) {
        String tem = a;
        a = b;
        b = tem;
        return length--;
    }

    private static void getData(String name) {

        String arr[] = name.split(" ");
        int length = arr.length - 1;
        for (int i = 0; i <= arr.length / 2; i++) {
            length = swap(arr[i], arr[length], length);

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        getData("Java Concept Of The Day");
    }
}
