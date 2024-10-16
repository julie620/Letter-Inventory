//IGNORE
//Juliana Old Code

/*Letter Inventory

import java.util.Scanner;

public class LetterInventoryOld {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Please enter some text");
        String text = input.nextLine().toUpperCase();

        int[] letters = new int[26]; // initializes array that contains count of each letter
        
        //sets each count to 0 to start
        for (int i = 0; i < 26; i++) {
            letters[i] = 0;
        } // end of for loop

        letterCounter(text, letters);
        results(letters);
        
    } // end of main method

    public static int[] letterCounter(String text, int[] letters) {
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            int number = (int)letter;
            if (number > 64 && number < 91) { // uses Dec value to test if char is letter
                int index = number - 65; // corresponds dec value of letter to index in letters[]
                letters[index] += 1; // adds to letter count
            } // end of if statement
        } // end of for loop
        return letters;
    } // end of letterCounter method

    public static void results(int[] letters) {
        for (int i = 65; i < 91; i++){
            int index = i - 65; // corresponds dec value of letter to index in letters[]
            char currentLetter = (char)i; // converts dec values of 65-90 to A-Z
            System.out.print(currentLetter + ": " + letters[index] + "    "); // prints out results
            if (index % 5 == 0 && index > 0) {
                System.out.println();
            }
        } // end of for loop
    } // end of results method

} // end of LetterInventory class*/