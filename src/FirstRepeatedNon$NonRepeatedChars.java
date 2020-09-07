import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedNon$NonRepeatedChars {

    private static void FirstRepeatedNonRepeatedChar(String chars)
    {
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        char [] arr=chars.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            map.put(arr[i],0);
        }

        for(Map.Entry<Character, Integer> maps : map.entrySet())
        {
            if(maps.getValue()>0)
            {
                System.out.println(maps.getKey());
                break;
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
     FirstRepeatedNonRepeatedChar("JavaConceptOfTheDay");
    }
}
