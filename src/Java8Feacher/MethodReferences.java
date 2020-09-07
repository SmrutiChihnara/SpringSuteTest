package Java8Feacher;

import sun.print.PSStreamPrintService;












interface Method{
    public void say(int a);

}
public class MethodReferences  implements Runnable{

    public MethodReferences(int a)
    {
        System.out.println(a);
    }

    public void run()
    {
        System.out.println("run");
    }
    public static  void getData()
    {
        System.out.println("method");
    }
    public static void main(String[] args) {
      /*  Method method=MethodReferences::getData;
      //  method.say();
        MethodReferences methodReferences= new MethodReferences();
        Thread thread= new Thread(methodReferences);
      //  thread.start();
        Method method1= new MethodReferences()::run;
        method1.say();*/
        Method method= MethodReferences::new;
        method.say(10);

    }
}
