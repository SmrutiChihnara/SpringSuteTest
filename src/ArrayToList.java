import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayToList {
    public void getData()
    {
        /*String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
        ArrayList<String>list= new ArrayList(Arrays.asList(array));
        Collections.addAll(list,array);
        list.addAll(Arrays.asList(array));
        Arrays.stream(array).collect(Collectors.toList());*/
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAVA");
        list.add("JSP");
        list.add("ANDROID");
        list.add("STRUTS");
        list.add("HADOOP");
        String s[]= new String[list.size()];
        list.toArray(s);

    }
}
