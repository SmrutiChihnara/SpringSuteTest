package HackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class Tets {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);

        scores.values().stream().sorted().collect(Collectors.toList());
        // System.out.println(scores.values());
        try {

        } catch (ArithmeticException   | ArrayIndexOutOfBoundsException ex)
        {

        }
    }
}