package main.java.lab2;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] ar1; // recommended
        int ar2[]; // not recommended

        int[] array1 = {1, 3, 5, 7};
        int[] array2 = new int[4];
        int[] array3 = new int[]{1, 3, 5, 7};
        int[] array4 = array2;

        System.out.println(array1);
        System.out.println("comparatie: " + (array1 == array3));
        System.out.println("compare: " + Arrays.compare(array1, array3));
        System.out.println("equals: " + Arrays.equals(array1, array3));

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }
    }
}
