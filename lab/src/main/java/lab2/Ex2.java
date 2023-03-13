package main.java.lab2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /*
        Cititi de la tastatura 2 valori: numele si varsta
        Afisati numele
        Daca varsta este impara, afisati toate numerele impare <= varsta
        Altfel, afisati toate numerele pare <= varsta
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele: ");
        String nume = scanner.nextLine();
        System.out.println("Introduceti varsta: ");
        int varsta = scanner.nextInt();

        int startNumber = varsta % 2 == 0 ? 0 : 1;

        System.out.println(nume);
        for (int i = startNumber; i <= varsta; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
