package InterviewQuection;

import java.util.Arrays;

public class SubArray {
    static void findSubArray(int[] inputArray, int inputNumber) {
        for (int i = 0; i < inputArray.length; i++) {
            int sum = 0;
            if (inputArray[i] < inputNumber) {
                sum = inputArray[i];

                for (int j = i + 1; j < inputArray.length; j++) {
                    sum = sum + inputArray[j];
                    if (sum > inputNumber) {
                        sum=sum-inputArray[j];
                    } else if (sum == inputNumber) {
                        for (int k = i; k <= j; k++) {
                            System.out.print(inputArray[k] + " ");
                        }

                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 32, 6}, 26);

        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }
}


