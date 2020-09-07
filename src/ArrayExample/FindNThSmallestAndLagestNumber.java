package ArrayExample;

import java.util.Arrays;

public class FindNThSmallestAndLagestNumber {
    public static void main(String[] args) {
        int arrr[]={5,10,10,2,3,6,2};
        int length=arrr.length;
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(arrr[i]<arrr[j])
                {
                    int temp=arrr[i];
                    arrr[i]=arrr[j];
                    arrr[j]=temp;
                }
                if(arrr[i]==arrr[j])
                {
                    for(int k=j;k<length-1;k++)
                    {
                        arrr[k]=arrr[k+1];

                    }
                    j--;
                   -- length;
                }
            }
        }

        for(int i:arrr)
        {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arrr));
    }
}
