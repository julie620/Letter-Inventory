// Lab 3: LetterInventory
// Dylan Wilson, Juliana Serrano, Thuong Nguyen

import java.util.Scanner;

public class LetterInventoy {

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for input

        System.out.println("Please enter some text"); // prompt
        String text = input.nextLine().toUpperCase(); // store as a string and convert to uppercase

        int[] letterCounts = countLetters(text);  // call countLetters method and return to letterCounts array

        printLetterCounts(letterCounts); // prints A-Z along with counts

        System.out.println("Letters: " + letterInventory(letterCounts)); // print letters

        input.close();  // Close the scanner
    } // end main method
    
    // countLetters method goes through the String text and counts the letters
    public static int[] countLetters(String text) {
        int[] letters = new int[26];  // Array to store counts of letters A-Z
        for (int i = 0; i < text.length(); i++) { // continue through all characters of input text
            char letter = text.charAt(i); // current letter is stored as char
            int number = (int) letter; // current letter
            if (number >= 65 && number <= 90) {  // Check if character is between 65 and 90 A=65 and Z=90
                int index = number - 65;  // Convert the ASCII value to index A = 0, Z = 25
                letters[index] += 1;  // add 1 to count
            }
        }
        return letters; // return array letters with counts for all characters
    } // end countLetters method
    
    // printLetterCounts method prints all the letters with the current counts
    public static void printLetterCounts(int[] letters) {
        for (int i = 65; i <= 90; i++) {  // Loop through ASCII values for 65 and 90 A=65 and Z=90
            int index = i - 65;  // Convert the ASCII value to array index A=0 and Z=25
            char currentLetter = (char) i;  // convert integer i to character
            System.out.println(currentLetter + ": " + letters[index]);  // Print the current letter and its count
        }
    } // end printLetterCounts method

    // letterInventory method will take the letters array and output a string with the letter inventory
    public static String letterInventory(int[] letters) {
        StringBuilder result = new StringBuilder();

            for (int i = 65; i <= 90; i++) { // Loop through letters 65 to 90 A=65 and Z=90
            int index = i - 65;  // Convert ASCII value to array index
            char currentLetter = (char) i;  // Convert ASCII value to character

            // Append the current letter as many times as needed
            for (int j = 0; j < letters[index]; j++) {
                result.append(currentLetter); // convert the appended letters to a string
            }
        }
        return result.toString();  // Return the formatted string
    } // end letterInventory method
    
} // end public class
