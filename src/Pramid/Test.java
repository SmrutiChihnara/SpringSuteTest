package Pramid;

import Java8Feacher.StreamApi;

import java.util.Scanner;

class MainClass {
    public void Pattern1()
    {

        int row = 1;
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= row; k++) {
                System.out.print(row + " ");
            }
            System.out.println();
            row++;
        }

    }

    public static void Pattern2()
    {
        int row = 1;
        for (int i = 9; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= row; k++) {
                System.out.print(k + " ");
            }

            for (int k = row; k >= row; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
            row++;
        }
    }
    public static void Pattern3()
    {
        int row = 1;
        for (int i = 9; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= row; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            row++;
        }
    }



    public static void main(String[] args) {
       Pattern2();
    }
}