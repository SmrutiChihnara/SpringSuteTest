/*

class Bank extends Thread {
    int totalAmount = 100;

    public static void main(String[] args) {
       Thread thread= new Thread("hello");




   */
/* public synchronized void get(int amount) {

        if (amount > totalAmount) {
            try {
                System.out.println("less amount");
                wait();
            } catch (Exception ex) {a

            }
            System.out.println("processing");
            totalAmount = totalAmount - amount;
            System.out.println("amount +" + totalAmount);

        }
    }

    public synchronized void deposit(int amount) {
        System.out.println("noti");
        notify();
        totalAmount = totalAmount + amount;
    }
}


public class ExampleThread {
    public static void main(String[] args) {
       Bank bank= new Bank();
       new Thread()
       {
           public  void run()
           {
               bank.get(300);
           }
       }.start();

       new  Thread()
       {
           public void run()
           {
               bank.deposit(200);
           }
       }.start();
    }
}
*/
