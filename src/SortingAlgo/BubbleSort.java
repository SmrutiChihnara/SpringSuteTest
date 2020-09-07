package SortingAlgo;

import ArrayExample.Arra;

import java.util.Arrays;

public class BubbleSort {
    public static void stringCompare() {
        String arr[] = {"BCD","ABC", "QWA", "ASD", "ERD"};
        String temp;
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1])>0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;

            }
        }
        System.out.println(Arrays.toString(arr));

    }

        public void intCompare ()
        {
            int arr[] = {36, 19, 29, 12, 5};
            int temp;
            for (int i = 0; i < arr.length; i++) {
                int flag = 0;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    break;

                }
            }
            System.out.println(Arrays.toString(arr));
        }


    public static void main(String[] args) {

stringCompare();
    }
}
