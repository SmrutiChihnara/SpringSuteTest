package SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        selectionSort (new int[]{10, 9, 7, 101, 23, 44, 12, 78, 34, 23});


    }

    private static void selectionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            if (j >= 0 && temp < arr[j]) {
                arr[i + 1] = arr[i];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        System.out.println ("Arrays.toString (arr) = " + Arrays.toString (arr));
    }
}
