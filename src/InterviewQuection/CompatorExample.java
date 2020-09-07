package InterviewQuection;

import java.util.*;

class Students{
    int rollno;
    String name;
    int age;
    Students(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
class AgeComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Students s1=(Students)o1;
        Students s2=(Students)o2;

        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}

    public class CompatorExample {
        public static void main(String args[]) {

            ArrayList al = new ArrayList();
            al.add(new Students(101, "Vijay", 23));
            al.add(new Students(106, "Ajay", 27));
            al.add(new Students(105, "Jai", 21));

            System.out.println("Sorting by Name");

            Collections.sort(al, new AgeComparator());
            Iterator itr = al.iterator();
            while (itr.hasNext()) {
                Students st = (Students) itr.next();
                System.out.println(st.rollno + " " + st.name + " " + st.age);
            }
        }
    }