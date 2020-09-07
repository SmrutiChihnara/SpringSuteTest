import javax.imageio.stream.ImageInputStream;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SynchronizedExample {
    public static void getData() {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list1 = Collections.synchronizedList(new ArrayList<Integer>());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                list.addAll(Arrays.asList(2, 4, 6, 8));
                list1.addAll(Arrays.asList(5, 10, 15, 20));
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                list.addAll(Arrays.asList(10, 12, 14, 16));
                list1.addAll(Arrays.asList(25, 30, 35, 40));
            }
        });

        thread.start();
        thread1.start();
        try {
            Thread.sleep(1000);
            System.out.println(list);
            System.out.println(list1);
        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {

        getData();
    }

}