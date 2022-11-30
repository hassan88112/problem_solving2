package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // array size
        System.out.print("Size is : ");
        int size = input.nextInt();

        int[] x = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your element : " + i);
            x[i] = input.nextInt();
        }
        int max = x[0];
        for (int i = 0; i < size; i++) {

            if (x[i] > max) {
                max = x[i];
            }
        }
        System.out.println("Maxmum num is " + max);

        int min = x[0];
        for (int i = 0; i < size; i++) {

            if (x[i] < min) {
                min = x[i];
            }
        }
        System.out.println("minimum num is " + min);

        //sum of element
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += x[i];

        }
        System.out.println("Sum is " + sum);

    }

}
