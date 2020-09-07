package InterviewQuection;

public class RecrsiveEx {
    int arr[]={2,1,3,10};
    int i=0;
    private void get(int number)
    {
        if(arr[i]!=number)
        {
            i++;
            get(number);

        }
        else System.out.println(i);

    }

    public static void main(String[] args) {
        new RecrsiveEx().get(10);
    }
}
