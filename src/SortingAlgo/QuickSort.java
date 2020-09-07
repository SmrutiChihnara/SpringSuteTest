package SortingAlgo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr={15,9,7,13,12,15,4,18,11};
        int length=arr.length;
        QuickSort  quickSort= new QuickSort();
        quickSort.quickSortRecursion(arr,0,length-1);
        quickSort.printArray(arr);
    }

    int partiction(int []arr,int low,int high)
    {
        int pivot=arr[(low+high)/2];
        while(low<=high)
        {
            while (arr[low]<pivot)
            {
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }

        }
        return low;
    }



    private void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private void quickSortRecursion(int[] arr, int low, int high) {

        int pi=partiction(arr,low,high);
        if(low<pi-1)
        {
            quickSortRecursion(arr,low,pi-1);
        }
        if(pi<high)
        {
            quickSortRecursion(arr,pi,high);
        }

    }
}
