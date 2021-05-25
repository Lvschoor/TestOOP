package be.intecbrussel;

import java.util.Scanner;

public class Guesses {
    //method to create an array with user entered int values
    public static int[] read(int numberOfReads) {

        Scanner kbd = new Scanner(System.in);
        int[] guesses = new int[numberOfReads];

        for (int i = 0; i < guesses.length; i++) {
            do {
                System.out.print("Gok " + (i + 1) + ": ");
                guesses[i] = kbd.nextInt();
            }
            while (guesses[i] < 1 || guesses[i] > 10);
        }
        return guesses;
    }
}
