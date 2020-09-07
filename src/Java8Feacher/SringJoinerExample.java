package Java8Feacher;

import java.util.StringJoiner;

public class SringJoinerExample {
    public static void main(String[] args) {
        StringJoiner stringJoiner= new StringJoiner(",");
        stringJoiner.add("java");
        stringJoiner.add("net");
        stringJoiner.add("hibernate");
        System.out.println(stringJoiner);
    }
}
