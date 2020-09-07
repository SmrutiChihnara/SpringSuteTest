package Java8Feacher;
@FunctionalInterface
interface Lamda
{
    public int getData(int a);

}

public class LamdaExpre {
    public static void main(String[] args) {
        Lamda lamda= ( b)->
        {
            return b;
        };
        lamda.getData(10);
    }
}
