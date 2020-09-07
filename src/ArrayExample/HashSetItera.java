package ArrayExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

 public class HashSetItera {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> maps = new HashMap<String, String>();
        //Adding elements to HashMap
        maps.put("John Kevin", "Average");
        maps.put("Rakesh Sharma", "Good");
        maps.put("Prachi D", "Very Good");
        maps.put("Ivan Jose", "Very Bad");
        maps.put("Smith Jacob", "Very Good");
        maps.put("Anjali N", "Bad");
  List<String>lis=      maps.keySet().stream().filter(key->key.charAt(0)=='S').collect(Collectors.toList());
        maps.values();


        for (Map.Entry<String, String> map : maps.entrySet()) {
            map.getKey();
            map.getValue();
        }

    }
}
