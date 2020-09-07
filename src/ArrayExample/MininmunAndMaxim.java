package ArrayExample;

public class MininmunAndMaxim {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,10,20,0,100};
        int min=arr[0];
        int max=arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            else if(min>arr[i])
            {
                min=arr[i];

            }

        }
        System.out.println("max"+max+" "+"min"+min);
    }
}
