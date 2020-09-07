/*
package CreateObject;


i

import java.io.*;
import java.lang.reflect.Constructor;
class Collage   implements  Externalizable
{
private int id =101;
private String name="smruti";
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
name=(String) in.readObject();
        System.out.println(name);
    }
}


*/
/*
class Student implements Cloneable, Serializable {
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
*//*

*/
/*  @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*//*
*/
/*


    int id = 10;
    String name = "jhon";

    Student() {
        System.out.println("student");
    }

    Student(int id, String name) {
        this
                .id = id
        ;
        this.name = name;
    }
}
*//*


public class ByClsssForName {
    public static void main(String[] args) throws Exception {
       */
/* Class <Student>aClass= (Class<Student>) Class.forName("Student");
        System.out.println(aClass.newInstance().id);*//*

      */
/*  Student student = new Student();
        Student student1 = (Student) student.clone();
        System.out.println(student == student1);*//*


       */
/* Student student = new Student(101, "jhon");
        FileOutputStream stream = new FileOutputStream("C:\\Users\\srchi\\OneDrive\\Desktop\\projectByme\\Test.java");
        ObjectOutputStream outputStream = new ObjectOutputStream(stream);
        outputStream.writeObject(student);*//*

      */
/*  FileInputStream stream= new FileInputStream("C:\\Users\\srchi\\OneDrive\\Desktop\\projectByme\\Test.java");
        ObjectInputStream objectInputStream= new ObjectInputStream(stream);
         Student  student=(Student) objectInputStream.readObject();*//*

       */
/* Constructor<Student> studentConstructor= Student.class.getDeclaredConstructor();
        Student student= studentConstructor.newInstance();
        System.out.println(student);*//*


Collage collage= new Collage();
FileOutputStream strea= new FileOutputStream("C:\\Users\\srchi\\OneDrive\\Desktop\\projectByme\\Test.java");
ObjectOutputStream objectInputStream= new ObjectOutputStream(strea);
Collage collage1= new Collage();

collage.writeExternal(objectInputStream);
    }
}
*/
