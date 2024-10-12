//Letter Inventory

import java.util.Scanner;

public class LetterInventory {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Please enter some text");
        String text = input.nextLine();

        text = text.toUpperCase();

        int[] letters = new int[26]; // initializes array that contains count of each letter
        
        //sets each count to 0 to start
        for (int i = 0; i < 26; i++) {
            letters[i] = 0;
        } // end of for loop

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            int number = (int)letter;
            if (number > 64 && number < 91) { // uses Dec value to test if char is letter
                int index = number - 65; // corresponds dec value of letter to index in letters[]
                letters[index] += 1; // adds to letter count
            } // end of if statement
        } // end of for loop

        for (int i = 65; i < 91; i++){
            int index = i - 65; // corresponds dec value of letter to index in letters[]
            char currentLetter = (char)i; // converts dec values of 65-90 to A-Z
            System.out.println(currentLetter + ": " + letters[index]); // prints out results
        } // end of for loop
    } // end of main method
} // end of LetterInventory class