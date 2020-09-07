package InterviewQuection;

import java.util.Arrays;

public class CheckBunaryNumber {
    public static void isBinaryOrNot(int number) {
        String helloWorld = "helloWorld";
        String name = "hrkk";
        String ValueOf = String.valueOf(number);
        boolean binary = true;
        for (int i = 0; i < 5; i++) {
            if (ValueOf.charAt(i) == '1' || ValueOf.charAt(i) == '0') {
                continue;
            } else binary = false;
            break;
        }
        if (binary) {
            System.out.println("Binary number");
        } else System.out.println("Not a number");


    }



    public static void main(String[] args) {
        isBinaryOrNot(128956);

        isBinaryOrNot(101110);

        isBinaryOrNot(42578);

        isBinaryOrNot(10110101);
    }
}
