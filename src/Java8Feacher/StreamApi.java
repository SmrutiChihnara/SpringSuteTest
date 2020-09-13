package Java8Feacher ;

import java.util.*;
import java.util.stream.Collectors;
class Product{
     protected    int id=10;
        String name;
        float price;
      /*  public Product(int id, String name, float price) {
                this.id = id;
                this.name = name;
                this.price = price;
        }*/
}


public class StreamApi
        {
                int a=10;
                public static void main(String[] args) {
                        ArrayList<Integer> list= new ArrayList<>();
                        list.add(10);
                        list.add(0);
                        list.add(110);
                        list.add(120);
                        list.add(70);
                        List<Integer>add=list.stream().filter(p->p>30).sorted().collect(Collectors.toList());
                        System.out.println(add);


                }
        }