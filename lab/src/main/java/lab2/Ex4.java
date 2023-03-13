package main.java.lab2;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        for (char c : chars) {
            System.out.println(c);
        }

        System.out.println("Arrays.toString(): " + Arrays.toString(chars));
    }
}
