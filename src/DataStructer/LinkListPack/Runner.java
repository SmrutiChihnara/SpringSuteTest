package DataStructer.LinkListPack;

public class Runner {
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(23);
        linkedList.pos(2,21);
        linkedList.insertfirst(100);
        linkedList.deleteAt(3);
        linkedList.show();
    }
}
