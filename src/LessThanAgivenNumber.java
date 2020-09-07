public class LessThanAgivenNumber {
    public static int getData(int number,int a)
    {
        for(int i=number;i>0;i--)
        {
            if(Integer.toString(i).indexOf(Integer.toString(a).charAt(0))==-1)
            {
                return i;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        System.out.println(getData(4582, 5));

    }
}
