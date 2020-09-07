package InterviewQuection;

import java.util.Scanner;

class DecimalToBinary {
    public static void getData(int number) {
        String binary = "";
        while (number > 0) {
            int rem = number % 2;
            binary = binary + rem;
            number = number / 2;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        getData(50);


    }
}
