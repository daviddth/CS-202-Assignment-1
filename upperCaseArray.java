/*Name: David Hoang
  Date: August 26, 2017
  CSC 202 - Assigment #1 18.16
*/
import java.util.Scanner;

public class upperCaseArray {

    public static void main(String [] args){

        Scanner scanInput = new Scanner(System.in);  // simple text scanner to grab text
        System.out.println("Please enter a string of letters: "); // print to screen asking user to enter some string
        String userInput = scanInput.nextLine(); // contain the string the user entered in a variable called userInput
        //System.out.print("This is what the user entered: " + userInput);
        System.out.println("The number of uppercase letters in your string is: " + count(userInput.toCharArray())); //call the count method and use userInput turned into a CharArray as argument
    }

    public static int count(char[] chars){ //method with char[] type argument
        int highOfChars = chars.length - 1; //counts the number of characters and then subtracts 1 to truly make it represent the last element, which is 5! NOT 6
        return count(chars, highOfChars); //call count with chars and highest element number in the array as arguments
    }

    public static int count(char[] chars, int high) { //high is initially set to the index of the last element in the charArray
        // condition ? expr1 : expr2  Java Conditional Operator true:false
        // tally is the total number of uppercase characters in the userinput
        int tally = Character.isUpperCase(chars[high]) ? 1 : 0; //It's going first with the highest index and asking the character of the index, is it capitalized? if it is, then Tally is 1. If it is not, Tally is 0.

        return (high == 0) ? tally : (tally + count(chars, high - 1)); //In this conditional operation the condition is whether we are at index 0 (high =0), if it is then we return Tally, if it is not at 0-
                                                                        // then we decrement the high by 1 to move the index -1 and then we call the count method again until we reach index 0 and all
                                                                        // uppercase characters are found and we return it to the screen.
    }
}

