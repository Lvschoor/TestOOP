package be.intecbrussel;

public class GokkenApp {
    public static void main(String[] args) {
        // we will use 2 arrays and 1 "counter"
        int[] randomNumbers;
        int[] guesses;

        // call create method in RandomArray utility class to generate the random array
        randomNumbers = RandomArray.create(5);
        // call read method in Guesses utility class to read the guesses from the user
        guesses = Guesses.read(5);

        //output guesses and computer generated values
        System.out.print('\n');
        System.out.print("Getallen gebruiker: \t");
        for (int guess : guesses) {
            System.out.print(guess + " ");
        }
        System.out.print('\n');
        System.out.print("Getallen computer: \t\t");
        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + " ");
        }
        System.out.println('\n');
        System.out.println("******************************");

        // ouput of correct guesses, using the count methode of the CorrectGuesses utility class, comparing the 2 arrays
        System.out.println("Aantal keer goed gegokt: " + CorrectGuesses.count(randomNumbers, guesses));
    }

}






