package be.intecbrussel;

public class CorrectGuesses {
    // method that compares 2 arrays and return the number of identical values at the same index
    public static int count(int[] array1, int[] array2) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                counter++;
            }
        }
        return counter;
    }
}
