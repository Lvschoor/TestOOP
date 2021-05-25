package be.intecbrussel;

import java.util.Random;

public class RandomArray {
    //create an array of random numbers between 1 and 10
    public static int[] create(int numberOfNumbers) {

        Random rand = new Random();
        int[] randomNumbers = new int[numberOfNumbers];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(10) + 1;
        }
        return randomNumbers;
    }
}
