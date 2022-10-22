/**
 *A program that checks if a given input s a palindrome by checking the first and last character of a string and then moving inwards
 * @author (Heaven IKe)
 * @version (22/10/2022)
 */

//importing  scanner
import java.util.Scanner;

public class Palindrome
{
    //assign scanner object to input
    static Scanner input = new Scanner(System.in);

    //method to spilt words into character in an array
    public static char[] stringToChar (String word )
    {
        //creating character array the length of the word
        char [] charArray =  new char[word.length()] ;
        //assign index of each character
        for (int i = 0;i < word.length(); i++){
            charArray[i] = word.charAt(i);
        }
        return charArray;
    }
    // method to check if first and next last char in the array are the same
    public static boolean isPalindrome (char [] charArray)
    {
        //assigning boolean value to true
        boolean isPalindrome = true;
        //for loop to check if i  and next last char in the array are the same
        for (int i = 0; i < charArray.length; i++){
            // length of the word minus one to find current index
            //if a character dot match word is not palindrome
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                isPalindrome = false;

            }
        }
        return isPalindrome;
    }
    public static void main(String[] args)
    {
        //loop until stop is typed
        while (true){
            //prompt user to enter a word
            System.out.println("Enter a word to check if it is a palindrome (Type \"Stop\" to cancel program )");
            System.out.print("Please enter a word :" );

            //assign input to word
            String word = input.next();
            //if stop is typed break loop
            if (word.equals("stop")){
                break;
            }
            //call method to split word into character
            //check if word is a palindrome
            //if true print word is palindrome
            if (isPalindrome(stringToChar(word))){
                System.out.println(word + " is a palindrome");
            }
            else {
                System.out.println(word + " is not a palindrome");
            }

        }

    }//end of main method
}//end of Palindrome
