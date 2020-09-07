package InterviewQuection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


public class CompareableExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(19, "smruti"), new Student(1, "smruti")
                , new Student(4, "ranjan"));
        Collections.sort(list);
        list.stream().forEach(System.out::println);
    }
}
