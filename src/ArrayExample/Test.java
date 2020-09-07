package ArrayExample;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

class MyClass {

    public static void main(String[] args) {
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("hello");
            }
        };
        consumer.accept(10);
    }
}
