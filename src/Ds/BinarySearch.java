package Ds;

public class BinarySearch {
    public static void main(String[] args) {
        binary (new int[]{20, 21, 34, 56, 67, 78}, 7);
    }

    private static void binary(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        boolean number=false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == num) {
                number=true;
                System.out.println ("mid = " + mid);
                break;
            } else if (num < arr[mid]) {
                high = mid - 1;
            } else low = mid + 1;
        }
        if (!number) {
            System.out.println ("not found");
        }


    }
}
