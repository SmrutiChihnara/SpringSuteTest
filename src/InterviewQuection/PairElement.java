package InterviewQuection;

public class PairElement {
    public static void getData(int []arr,int number)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==number&&arr[i]!=-1)
                {
                    System.out.println(arr[i]+"+"+arr[j]+"="+number);
                    arr[i]=-1;
                }
            }
        }
    }

    public static void main(String[] args) {
        getData(new int []{2,3,1,4,5,3,6},5);
    }

}
