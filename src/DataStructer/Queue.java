package DataStructer;

import java.util.ArrayDeque;

class Queue {
    int font,rear=0;
    int queue []= new  int[2];
    int lenght=queue.length;
public void insert(int data){
    if(rear==lenght)
    {
        lenght=lenght*2;

        int newQueue[]= new int[lenght];
        System.arraycopy(queue,0,newQueue,0,rear);
        System.out.println("if block");
        queue=newQueue;
    }

queue[rear]=data;
rear++;
}
public void delete() {
    for (int i = font; i < rear; i++) {
        queue[i] = queue[i + 1];

    }
    rear--;
}

public void show()
    {
        for(int i=font;i<rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
}

class QueueMain
{
    public static void main(String[] args) {
        Queue queue= new Queue();
        queue.insert(1);
        queue.insert(100);
        queue.insert(20);

       // queue.delete();
        queue.show();
    }

}