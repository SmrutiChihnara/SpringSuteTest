package ArrayExample;

public class CountNumberOfOccrence {

    public void number()
    {
        int arr[] = {1, 2, 3, 1, 2, 2, 3, 1, 4, 4, 5, 3};
        for (int i = 0; i < arr.length-1; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != -1) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;
                    }
                }
            }
            if(count>1)
            {
                System.out.println(arr[i]+"     "+count);
            }


    }
}
    public  static void numberOfOccrence() {

        int arr[] = {1, 2, 3, 1, 2, 2, 3, 1, 4, 4, 5, 3};
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int count = 1;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    for (int k = j; k < length-1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    j--;
                    length--;
                }

            }
            System.out.println(arr[i] + "   " + count);
        }
    }

    public static void main(String[] args) {

numberOfOccrence();



    }
}
