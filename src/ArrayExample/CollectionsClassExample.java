package ArrayExample;
import java.util.*;
public class CollectionsClassExample {
    public static void main(String[] args) {
      ArrayList<Integer> arrayList= new ArrayList<Integer>();
      arrayList.add(10);
      arrayList.add(20);
      arrayList.add(1);
      arrayList.add(20);
      for(int s:arrayList)
      {
          System.out.println();
      }
      arrayList.forEach(System.out::println);
      Iterator<Integer>iterator= arrayList.iterator();
      while (iterator.hasNext())
      {
          System.out.println(iterator.next());
      }
int count=0;
      while (arrayList.size()>count)
      {
          System.out.println(arrayList.get(count));
          count++;
      }
Enumeration<Integer> enumeration=Collections.enumeration(arrayList);
      while (enumeration.hasMoreElements())
      {
          System.out.println(enumeration.nextElement());
      }
Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println();
    }
}